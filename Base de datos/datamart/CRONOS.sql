CREATE DEFINER=`root`@`localhost` PROCEDURE `CRONOS`()
BEGIN
	DECLARE var_id_trimestre BIGINT;
    DECLARE var_fecha_fin DATE;
    
	-- extrae el trimestre proximo por finalizar
	SET var_id_trimestre := (SELECT ID FROM db_cyad_posgrado_datamart.cat_trimestres 
	WHERE isProcesado = false AND NOW() >= fecha_fin LIMIT 1);

	SELECT 'ENTRO A EJECUCION CRONOS';
    IF var_id_trimestre IS NOT NULL THEN
		SELECT 'SE VALIDO QUE SI HABIA UN TRIMESTRE EN VIGENCIA';
        SET var_fecha_fin := (SELECT fecha_fin FROM db_cyad_posgrado_datamart.cat_trimestres 
		WHERE id = var_id_trimestre);
        
		IF var_fecha_fin <= CURDATE() THEN
			SELECT 'SE LLAMA A GENERAR HISTORIAL';
			CALL GENERAR_HISTORIAL(var_id_trimestre);
        END IF;
    END IF;
    
END