package com.cyad.producciones.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cyad.producciones.entity.EProduccion;
import com.cyad.producciones.model.MProduccion;

public interface IProduccionService {
	public abstract MProduccion crear(EProduccion produccion);
	public abstract long cargarDocumento(long id, MultipartFile file);
	public abstract boolean descargar(long id); 
	public abstract boolean actualizar(EProduccion produccion);
	public abstract boolean borrar(long id);
	public abstract List<MProduccion> obtener();
	public abstract MProduccion obtener(long id);
}
