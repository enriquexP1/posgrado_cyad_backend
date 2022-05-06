package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.ETipoAutor;
import com.cyad.producciones.model.MTipoAutor;

public interface ITipoAutorService {
	public abstract boolean crear(ETipoAutor autores);
	public abstract boolean actualizar(ETipoAutor autores);
	public abstract boolean borrar(long id);
	public abstract List<MTipoAutor> obtener();
	public abstract MTipoAutor obtener(long id);
}
