package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.ETrimestre;
import com.cyad.posgrado.model.MTrimestre;

public interface ITrimestreService {
	public abstract boolean crear(ETrimestre trimestre);
	public abstract boolean actualizar(ETrimestre trimestre);
	public abstract boolean borrar(long id);
	public abstract List<MTrimestre> obtener();
	public abstract MTrimestre obtener(long id);
}
