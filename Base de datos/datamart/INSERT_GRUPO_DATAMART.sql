CREATE DEFINER=`root`@`localhost` PROCEDURE `INSERT_GRUPO_DATAMART`(
	IN in_id_grupo BIGINT
    )
BEGIN
	INSERT IGNORE INTO db_cyad_posgrado_datamart.tb_grupo_protocolo(id) VALUE (in_id_grupo);
END