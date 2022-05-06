package com.cyad.aspirantes.service;

import java.util.List;

import com.cyad.aspirantes.entity.EEstadoAspirante;
import com.cyad.aspirantes.model.MEstadoAspirante;

public interface IEstadoAspiranteService {
	public abstract boolean crear(EEstadoAspirante aspirante);
	public abstract boolean actualizar(EEstadoAspirante aspirante);
	public abstract boolean borrar(long id);
	public abstract List<MEstadoAspirante> obtener();
	public abstract MEstadoAspirante obtener(long id);
}
