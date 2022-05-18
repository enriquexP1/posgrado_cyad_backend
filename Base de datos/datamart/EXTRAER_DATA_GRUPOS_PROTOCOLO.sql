CREATE DEFINER=`root`@`localhost` PROCEDURE `EXTRAER_DATA_GRUPOS_PROTOCOLO`()
BEGIN
	DECLARE var_id_grupo_protocolo BIGINT;
	DECLARE var_final INTEGER DEFAULT 0;
    
    DECLARE cursor_grupos_protocolo CURSOR FOR SELECT grupo_protocolo.id
											FROM
												db_cyad_posgrado.grupo_protocolo;
                                                
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET var_final = 1;

	OPEN cursor_grupos_protocolo;
    
    bucle: LOOP
		FETCH cursor_grupos_protocolo INTO var_id_grupo_protocolo;
        
        IF var_final = 1 THEN
			LEAVE bucle;
		END IF;

		CALL INSERT_GRUPO_DATAMART(var_id_grupo_protocolo);
        
    END LOOP bucle;
    CLOSE cursor_grupos_protocolo;
END