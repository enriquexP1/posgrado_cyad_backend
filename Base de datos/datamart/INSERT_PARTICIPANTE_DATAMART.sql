CREATE DEFINER=`root`@`localhost` PROCEDURE `INSERT_PARTICIPANTE_DATAMART`(
	IN in_id_participante BIGINT,
    IN in_id_grupo BIGINT,
    IN in_rol VARCHAR(75),
    IN in_nombre VARCHAR(255),
    IN in_ap_paterno VARCHAR(255),
    IN in_ap_materno VARCHAR(255))
BEGIN
	INSERT INTO db_cyad_posgrado_datamart.tb_participante(id, rol, nombre, ap_paterno, ap_materno, id_grupo_protocolo)
    VALUES(in_id_participante, in_rol, in_nombre, in_ap_paterno, in_ap_materno, in_id_grupo)
	ON DUPLICATE KEY UPDATE
    rol = in_rol,
    nombre = in_nombre,
	ap_paterno = in_ap_paterno,
    ap_materno = in_ap_materno,
    id_grupo_protocolo = in_id_grupo;
END