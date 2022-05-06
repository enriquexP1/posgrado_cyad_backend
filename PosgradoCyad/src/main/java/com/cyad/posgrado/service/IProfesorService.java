package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EProfesor;
import com.cyad.posgrado.model.MProfesor;

public interface IProfesorService {
	public abstract boolean crear(EProfesor profesor);
	public abstract boolean actualizar(EProfesor profesor);
	public abstract boolean borrar(long id);
	public abstract List<MProfesor> obtener();
	public abstract MProfesor obtener(long id);
}
