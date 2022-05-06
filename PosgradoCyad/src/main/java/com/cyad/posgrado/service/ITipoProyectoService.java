package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.ETipoProyecto;
import com.cyad.posgrado.model.MTipoProyecto;

public interface ITipoProyectoService {
	public abstract boolean crear(ETipoProyecto tipo);
	public abstract boolean actualizar(ETipoProyecto tipo);
	public abstract boolean borrar(long id);
	public abstract List<MTipoProyecto> obtener();
	public abstract MTipoProyecto obtener(long id);
}
