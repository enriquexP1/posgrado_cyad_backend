CREATE DEFINER=`root`@`localhost` PROCEDURE `EXTRAER_DATA_PROYECTO`(IN in_id_alumno BIGINT)
BEGIN
	-- tabla proyecto
	DECLARE var_id_proyecto BIGINT;
    DECLARE var_id_grupo BIGINT;
    DECLARE var_titulo VARCHAR(255);
	DECLARE var_lgac VARCHAR(255);
    
    SET var_id_proyecto := (SELECT id FROM db_cyad_posgrado.proyecto WHERE id_alumno = in_id_alumno); 
    IF var_id_proyecto IS NOT NULL THEN
		SET var_id_grupo := (SELECT id_grupo FROM db_cyad_posgrado.proyecto WHERE id_alumno = in_id_alumno);
		SET var_titulo := (SELECT titulo FROM db_cyad_posgrado.proyecto WHERE id_alumno = in_id_alumno);
		SET var_lgac := (SELECT lgac FROM db_cyad_posgrado.proyecto WHERE id_alumno = in_id_alumno);
	
		CALL INSERT_PROYECTO_DATAMART(in_id_alumno, var_id_proyecto, var_id_grupo, var_titulo);
	END IF;
END