package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.entity.EProyectoDatamart;
import com.cyad.datamart.model.MProyectoDatamart;

public interface IProyectoService {
	public abstract boolean crear(EProyectoDatamart proyecto);

	public abstract boolean actualizar();

	public abstract boolean borrar(long id);

	public abstract List<MProyectoDatamart> obtener();
}
