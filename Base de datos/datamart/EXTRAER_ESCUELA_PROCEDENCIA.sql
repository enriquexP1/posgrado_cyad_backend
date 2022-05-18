CREATE DEFINER=`root`@`localhost` PROCEDURE `EXTRAER_ESCUELA_PROCEDENCIA`(IN id_alumno BIGINT)
BEGIN
	-- tabla datos ingreso
    DECLARE var_escuela_procedencia VARCHAR(255);
    
    SET var_escuela_procedencia := (SELECT escuela_procedencia FROM db_cyad_posgrado.datos_ingreso WHERE id_alumno_datos_ingreso = id_alumno); 
    
    UPDATE db_cyad_posgrado_datamart.tb_alumno SET escuela_procedencia = var_escuela_procedencia WHERE tb_alumno.id = id_alumno;
    
END