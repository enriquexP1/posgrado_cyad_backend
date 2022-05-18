CREATE DEFINER=`root`@`localhost` PROCEDURE `EXTRAER_DATOS_ACADEMICOS`(
	IN in_id_alumno BIGINT,
    IN in_id_trimestre BIGINT
    )
BEGIN
	-- tabla datos academicos
    DECLARE var_t_ingreso VARCHAR(255);
    DECLARE var_t_egreso VARCHAR(255);
    DECLARE var_fecha_egreso_disertacion DATE;
    DECLARE var_estado VARCHAR(255);
    DECLARE var_promedio FLOAT;
    DECLARE var_creditos INT;

	SET @flag := (SELECT fecha_examen_disertacion FROM db_cyad_posgrado_datamart.tb_alumno WHERE id = in_id_alumno);
    
	-- mientras no exista registro de fecha de egreso o disertacion se sigue con la extraccion de datos
	IF @flag IS NULL THEN
		SET var_t_ingreso := (SELECT trimestre_ingreso FROM db_cyad_posgrado.datos_academicos WHERE id_alumno = in_id_alumno);
		SET var_t_egreso := (SELECT trimestre_egreso FROM db_cyad_posgrado.datos_academicos WHERE id_alumno = in_id_alumno);
		SET var_estado := (SELECT estado FROM db_cyad_posgrado.datos_academicos, db_cyad_posgrado.cat_estado_academico WHERE datos_academicos.id_alumno = in_id_alumno AND id_estado_academico = cat_estado_academico.id);
		SET var_promedio := (SELECT promedio FROM db_cyad_posgrado.datos_academicos WHERE id_alumno = in_id_alumno);
		SET var_creditos := (SELECT creditos_acumulados FROM db_cyad_posgrado.datos_academicos WHERE id_alumno = in_id_alumno);

		SET var_fecha_egreso_disertacion := (SELECT fecha_egreso FROM db_cyad_posgrado.datos_academicos WHERE id_alumno = in_id_alumno);
        IF var_fecha_egreso_disertacion = NULL THEN
			SET var_fecha_egreso_disertacion := (SELECT fecha_disertacion FROM db_cyad_posgrado.datos_academicos WHERE id_alumno = in_id_alumno);
		END IF;
        
        -- insertar datos en datamart
        CALL INSERT_DATOS_POR_TRIMESTRE(in_id_alumno, var_estado, var_promedio, var_creditos, in_id_trimestre);
        -- actualizando los datos de alumno
         UPDATE db_cyad_posgrado_datamart.tb_alumno 
			SET fecha_examen_disertacion = var_fecha_egreso_disertacion,
				trimestre_ingreso = var_t_ingreso,
                trimestre_egreso = var_t_egreso
            WHERE id = in_id_alumno;
        -- marcar el trimestre como proceso aplicado
		UPDATE db_cyad_posgrado_datamart.cat_trimestres 
			SET ISPROCESADO = TRUE
            WHERE id = in_id_trimestre;
	END IF;
END