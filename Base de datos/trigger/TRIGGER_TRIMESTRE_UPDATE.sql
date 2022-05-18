CREATE DEFINER=`root`@`localhost` TRIGGER TRIGGER_TRIMESTRE_UPDATE 
AFTER UPDATE ON db_cyad_posgrado.trimestres 
FOR EACH ROW
	CALL UPDATE_TRIMESTRE_DATAMART(OLD.id, NEW.fecha_inicio, NEW.fecha_fin, NEW.trimestre)