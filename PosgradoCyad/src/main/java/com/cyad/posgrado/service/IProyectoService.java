package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EProyecto;
import com.cyad.posgrado.model.MProyecto;

public interface IProyectoService {
	public abstract boolean crear(EProyecto proyecto);
	public abstract boolean actualizar(EProyecto proyecto);
	public abstract boolean borrar(long id);
	public abstract List<MProyecto> obtener();
	public abstract MProyecto obtener(long id);
}
