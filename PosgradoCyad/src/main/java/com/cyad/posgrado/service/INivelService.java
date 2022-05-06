package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.ENivel;
import com.cyad.posgrado.model.MNivel;

public interface INivelService {
	public abstract boolean crear(ENivel nivel);
	public abstract boolean actualizar(ENivel nivel);
	public abstract boolean borrar(long id);
	public abstract List<MNivel> obtener();
	public abstract MNivel obtener(long id);
}
