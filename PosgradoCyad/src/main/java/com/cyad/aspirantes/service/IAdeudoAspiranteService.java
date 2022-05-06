package com.cyad.aspirantes.service;

import java.util.List;

import com.cyad.aspirantes.entity.EAdeudoAspirante;
import com.cyad.aspirantes.model.MAdeudoAspirante;

public interface IAdeudoAspiranteService {
	public abstract boolean crear(EAdeudoAspirante adeudo);
	public abstract boolean actualizar(EAdeudoAspirante adeudo);
	public abstract boolean borrar(long id);
	public abstract List<MAdeudoAspirante> obtener();
}
