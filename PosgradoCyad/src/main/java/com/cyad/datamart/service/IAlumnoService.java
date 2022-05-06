package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.entity.EAlumnoDatamart;
import com.cyad.datamart.model.MAlumnoDatamart;

public interface IAlumnoService {
	public abstract boolean crear(EAlumnoDatamart alumno);

	public abstract boolean actualizar(EAlumnoDatamart alumno);

	public abstract boolean borrar(long id);

	public abstract List<MAlumnoDatamart> obtener();
}
