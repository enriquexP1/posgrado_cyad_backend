package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.ETipoClave;
import com.cyad.producciones.model.MTipoClave;

public interface ITipoClaveService {
	public abstract boolean crear(ETipoClave clave);
	public abstract boolean actualizar(ETipoClave clave);
	public abstract boolean borrar(long id);
	public abstract List<MTipoClave> obtener();
	public abstract MTipoClave obtener(long id);
}
