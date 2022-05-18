CREATE DEFINER=`root`@`localhost` TRIGGER TRIGGER_TRIMESTRE 
AFTER INSERT ON db_cyad_posgrado.trimestres 
FOR EACH ROW
	CALL INSERT_TRIMESTRE_DATAMART(NEW.id, NEW.fecha_inicio, NEW.fecha_fin, NEW.trimestre)