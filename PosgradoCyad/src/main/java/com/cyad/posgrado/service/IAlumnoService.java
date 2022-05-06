package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EAlumno;
import com.cyad.posgrado.model.MAlumno;

public interface IAlumnoService {
	public abstract long crear(EAlumno alumno);
	public abstract boolean actualizar(EAlumno alumno);
	public abstract boolean borrar(long id);
	public abstract List<MAlumno> obtener();
	public abstract MAlumno obtener(long id);
}
