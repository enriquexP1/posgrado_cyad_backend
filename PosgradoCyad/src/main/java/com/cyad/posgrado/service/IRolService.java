package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.ERol;
import com.cyad.posgrado.model.MRol;

public interface IRolService {
	public abstract boolean crear(ERol rol);
	public abstract boolean actualizar(ERol rol);
	public abstract boolean borrar(long id);
	public abstract List<MRol> obtener();
	public abstract MRol obtener(long id);
}
