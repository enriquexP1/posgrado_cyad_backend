package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EEstadoAcademico;
import com.cyad.posgrado.model.MEstadoAcademico;

public interface IEstadoAcademicoService {
	public abstract boolean crear(EEstadoAcademico estado);
	public abstract boolean actualizar(EEstadoAcademico estado);
	public abstract boolean borrar(long id);
	public abstract List<MEstadoAcademico> obtener();
	public abstract MEstadoAcademico obtener(long id);
}
