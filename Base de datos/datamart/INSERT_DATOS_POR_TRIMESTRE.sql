CREATE DEFINER=`root`@`localhost` PROCEDURE `INSERT_DATOS_POR_TRIMESTRE`(
	IN in_id_trayectoria BIGINT,
    IN in_estado VARCHAR(45),
    IN in_promedio FLOAT,
    IN in_creditos INT,
    IN in_id_trimestre BIGINT
)
BEGIN
	INSERT INTO db_cyad_posgrado_datamart.tb_datos_por_trimestre(estado, promedio, creditos, id_trayectoria, id_cat_trimestre)
    VALUES(
		in_estado,
		in_promedio,
		in_creditos,
        in_id_trayectoria,
        in_id_trimestre);
END