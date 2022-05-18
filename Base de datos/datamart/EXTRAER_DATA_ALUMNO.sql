CREATE DEFINER=`root`@`localhost` PROCEDURE `EXTRAER_DATA_ALUMNO`()
BEGIN
	DECLARE var_id_alum BIGINT;
    DECLARE var_nombre VARCHAR(255);
    DECLARE var_ap_paterno VARCHAR(255);
	DECLARE var_ap_materno VARCHAR(255);
    
	-- indicador de final
    DECLARE var_final_alumno INTEGER DEFAULT 0;
    
    -- cursores para las selecciones de datos
    DECLARE cursor_alum CURSOR FOR SELECT ID, NOMBRE, AP_PATERNO, AP_MATERNO
											FROM  
												db_cyad_posgrado.alumno;
	
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET var_final_alumno = 1;
    
    OPEN cursor_alum;
    
    bucle_alumno: LOOP
		FETCH cursor_alum INTO var_id_alum, var_nombre, var_ap_paterno, var_ap_materno;
        
        IF var_final_alumno = 1 THEN
			LEAVE bucle_alumno;
		END IF;
        
        CALL INSERT_ALUMNO_DATAMART(var_id_alum, var_nombre, var_ap_paterno, var_ap_materno);
        
    END LOOP bucle_alumno;
    CLOSE cursor_alum;
END