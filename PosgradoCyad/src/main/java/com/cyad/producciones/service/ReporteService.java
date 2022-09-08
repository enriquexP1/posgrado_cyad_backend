package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorReporte;
import com.cyad.producciones.entity.EReporte;
import com.cyad.producciones.model.MReporte;
import com.cyad.producciones.repository.IReporteRepository;

/**
 * implementacion de la interface IReporteService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_reporte")
public class ReporteService implements IReporteService{
	@Autowired
	@Qualifier("repositorio_reporte")
	private IReporteRepository repositorio;

	@Autowired
	@Qualifier("convertidor_reporte")
	private ConvertidorReporte convertidor;

	private static final Log logger = LogFactory.getLog(ReporteService.class);

	@Override
	public boolean crear(EReporte reporte) {
		try {
			logger.info("EXITO AL CREAR EL REPORTE");
			repositorio.save(reporte);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR EL REPORTE");
			return false;
		}
	}

	@Override
	public boolean actualizar(EReporte reporte) {
		try {
			logger.info("EXITO AL ACTUALIZAR EL REPORTE");
			repositorio.save(reporte);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR EL REPORTE");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR EL REPORTE");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR EL REPORTE");
			return false;
		}
	}

	@Override
	public List<MReporte> obtener() {
		try {
			logger.info("EXITO AL LISTAR LOS REPORTES");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LOS REPORTES");
			return null;
		}
	}

	@Override
	public MReporte obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER EL REPORTE");
			return new MReporte(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER EL REPORTE");
			return null;
		}
	}
	

}
