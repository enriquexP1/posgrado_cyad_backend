package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.ETipoProduccion;
import com.cyad.producciones.model.MTipoProduccion;

public interface ITipoProduccionService {
	public abstract boolean crear(ETipoProduccion tipo);
	public abstract boolean actualizar(ETipoProduccion tipo);
	public abstract boolean borrar(long id);
	public abstract List<MTipoProduccion> obtener();
	public abstract MTipoProduccion obtener(long id);
}
