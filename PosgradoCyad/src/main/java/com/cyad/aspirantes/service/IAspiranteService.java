package com.cyad.aspirantes.service;

import java.util.List;

import com.cyad.aspirantes.entity.EAspirante;
import com.cyad.aspirantes.model.MAspirante;

public interface IAspiranteService {
	public abstract boolean crear(EAspirante aspirante);
	public abstract boolean actualizar(EAspirante aspirante);
	public abstract boolean borrar(long id);
	public abstract List<MAspirante> obtener();
	public abstract MAspirante obtener(long id);
}
