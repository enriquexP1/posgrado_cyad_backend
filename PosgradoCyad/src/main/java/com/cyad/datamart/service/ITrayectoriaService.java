package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.entity.ETrayectoriaDatamart;
import com.cyad.datamart.model.MTrayectoriaDatamart;

public interface ITrayectoriaService {
	public abstract boolean crear(ETrayectoriaDatamart trayectoria);

	public abstract boolean actualizar();

	public abstract boolean borrar(long id);

	public abstract List<MTrayectoriaDatamart> obtener();
}
