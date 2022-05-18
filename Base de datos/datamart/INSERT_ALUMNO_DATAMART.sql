CREATE DEFINER=`root`@`localhost` PROCEDURE `INSERT_ALUMNO_DATAMART`(
	IN in_id BIGINT, 
    IN in_nombre VARCHAR(255),
    IN in_ap_paterno VARCHAR(255),
    IN in_ap_materno VARCHAR(255))
BEGIN
	-- si existe el id de alumno solo se actualizan sus datos
	INSERT INTO db_cyad_posgrado_datamart.tb_alumno (id, nombre, ap_paterno, ap_materno) 
    VALUES (in_id, in_nombre, in_ap_paterno, in_ap_materno)
    ON DUPLICATE KEY UPDATE
    id = in_id,
    nombre = in_nombre,
    ap_paterno = in_ap_paterno,
    ap_materno = in_ap_materno;
    
    IF FOUND_ROWS() >= 1 THEN
		-- se inserta el mismo id de alumno en como id de trayectoria
		INSERT IGNORE INTO db_cyad_posgrado_datamart.tb_trayectoria(id)
			VALUE(in_id);
        UPDATE db_cyad_posgrado_datamart.tb_alumno 
			SET id_trayectoria = in_id
            WHERE tb_alumno.id = in_id;
	END IF;
END