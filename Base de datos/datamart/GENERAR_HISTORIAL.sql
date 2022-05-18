CREATE DEFINER=`root`@`localhost` PROCEDURE `GENERAR_HISTORIAL`(IN in_id_trimestre BIGINT)
BEGIN
	-- variables para extraccion de informacion
	-- tabla alumno
    DECLARE var_id_alum BIGINT;
    DECLARE var_nombre VARCHAR(255);
    DECLARE var_ap_paterno VARCHAR(255);
	DECLARE var_ap_materno VARCHAR(255);
    
    -- variable de control
    DECLARE var_final_alumno INTEGER DEFAULT 0;
    -- cursores para las selecciones de datos
    DECLARE cursor_alum CURSOR FOR SELECT ID, NOMBRE, AP_PATERNO, AP_MATERNO
											FROM  
												db_cyad_posgrado.alumno;
	-- variable de control
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET var_final_alumno = 1;

	-- extraccion de grupos de protocolo
    CALL EXTRAER_DATA_GRUPOS_PROTOCOLO;
	-- extraccion de participantes
    CALL EXTRAER_DATA_PARTICIPANTES;
	-- extraccion de alumnos
    OPEN cursor_alum;
    
    bucle_alumno: LOOP
		FETCH cursor_alum INTO var_id_alum, var_nombre, var_ap_paterno, var_ap_materno;
        
        IF var_final_alumno = 1 THEN
			LEAVE bucle_alumno;
		END IF;
        
        CALL INSERT_ALUMNO_DATAMART(var_id_alum, var_nombre, var_ap_paterno, var_ap_materno);
        CALL EXTRAER_ESCUELA_PROCEDENCIA(var_id_alum);
        CALL EXTRAER_DATOS_ACADEMICOS(var_id_alum, in_id_trimestre);
        CALL EXTRAER_DATA_PROYECTO(var_id_alum);
        
    END LOOP bucle_alumno;
    CLOSE cursor_alum;

END