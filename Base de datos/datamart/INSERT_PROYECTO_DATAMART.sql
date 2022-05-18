CREATE DEFINER=`root`@`localhost` PROCEDURE `INSERT_PROYECTO_DATAMART`(
	IN in_id_alumno BIGINT,
    IN in_id_proyecto BIGINT,
    IN in_id_grupo BIGINT,
    IN in_titulo VARCHAR(255)
    )
BEGIN
	INSERT INTO db_cyad_posgrado_datamart.tb_proyecto (id, titulo, id_grupo_protocolo) 
    VALUES (in_id_proyecto, in_titulo, in_id_grupo)
    ON DUPLICATE KEY UPDATE
    titulo = in_titulo,
    id_grupo_protocolo = in_id_grupo;
    
    IF FOUND_ROWS() >= 1 THEN
		UPDATE db_cyad_posgrado_datamart.tb_alumno 
        SET db_cyad_posgrado_datamart.tb_alumno.id_proyecto = in_id_proyecto 
        WHERE (db_cyad_posgrado_datamart.tb_alumno.id = in_id_alumno );
	END IF;
END