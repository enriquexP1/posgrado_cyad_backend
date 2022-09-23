package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorDocumentosReseñas;
import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.model.MDocumentos_Reseñas;
import com.cyad.producciones.repository.DocumentosReseñasRepository;

/**
 * implementacion de la interface IDocumentosReseña para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_documento_reseña")
public class DocumentoReseñaService implements IDocumentosReseñaService {
	@Autowired
	@Qualifier("repositorio_documento_reseña")
	private DocumentosReseñasRepository repositorio;

	@Autowired
	@Qualifier("convertidor_documento_reseña")
	private ConvertidorDocumentosReseñas convertidor;

	private static final Log logger = LogFactory.getLog(DocumentoReseñaService.class);

	@Override
	public boolean crear(EDocumentos_Reseñas doc) {
		try {
			logger.info("EXITO AL CREAR DOCUMENTO/RESEÑA");
			repositorio.save(doc);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR DOCUMENTO/RESEÑA");
			return false;

		}
	}

	@Override
	public boolean actualizar(EDocumentos_Reseñas doc) {
		try {
			logger.info("EXITO AL ACTUALIZAR DOCUMENTO/RESEÑA");
			repositorio.save(doc);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR DOCUMENTO/RESEÑA");
			return false;

		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR DOCUMENTO/RESEÑA");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR DOCUMENTO/RESEÑA");
			return false;

		}
	}

	@Override
	public List<MDocumentos_Reseñas> obtener() {
		try {
			logger.info("EXITO AL LISTAR DOCUMENTOS/RESEÑAS");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR DOCUMENTOS/RESEÑAS");
			return null;
		}
	}

	@Override
	public MDocumentos_Reseñas obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER DOCUMENTO/RESEÑA");
			return new MDocumentos_Reseñas(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER DOCUMENTO/RESEÑA");
			return null;
		}
	}

}
