package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.model.MAlumnoDatamart;

public interface IDatamartService {
	public abstract boolean generarHistorial();
	public abstract MAlumnoDatamart obtenerHistorialAlumno(long id);
	public abstract List<MAlumnoDatamart> obtenerHistoriales();
	public abstract List<MAlumnoDatamart> obtenerHistorialesAlumnos(List<Integer> ids);
}
