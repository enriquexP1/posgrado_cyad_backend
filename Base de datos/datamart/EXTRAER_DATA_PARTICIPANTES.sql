CREATE DEFINER=`root`@`localhost` PROCEDURE `EXTRAER_DATA_PARTICIPANTES`()
BEGIN
	DECLARE var_id_participante BIGINT;
	DECLARE var_rol_participante VARCHAR(255);
	DECLARE var_nombre_participante VARCHAR(255);
    DECLARE var_ap_paterno_participante VARCHAR(255);
	DECLARE var_ap_materno_participante VARCHAR(255);
    DECLARE var_id_grupo BIGINT;
	
    DECLARE var_final INTEGER DEFAULT 0;
    DECLARE cursor_participantes CURSOR FOR SELECT participantes.id, rol, nombre, ap_paterno, ap_materno, id_grupo
											FROM
												db_cyad_posgrado.participantes,
												db_cyad_posgrado.grupo_protocolo,
                                                db_cyad_posgrado.profesor,
                                                db_cyad_posgrado.cat_rol
                                            WHERE
												participantes.id_grupo = grupo_protocolo.id AND
												participantes.id_rol = cat_rol.id AND
                                                participantes.id_profesor = profesor.id;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET var_final = 1;
    
	OPEN cursor_participantes;
    
    bucle: LOOP
		FETCH cursor_participantes INTO var_id_participante, var_rol_participante, var_nombre_participante, var_ap_paterno_participante, var_ap_materno_participante, var_id_grupo;
        
        IF var_final = 1 THEN
			LEAVE bucle;
		END IF;

		CALL INSERT_PARTICIPANTE_DATAMART(var_id_participante, var_id_grupo, var_rol_participante, var_nombre_participante, var_ap_paterno_participante, var_ap_materno_participante);
        
    END LOOP bucle;
    CLOSE cursor_participantes;
END