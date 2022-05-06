package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EInstitucion;
import com.cyad.posgrado.model.MInstitucion;

public interface IInstitucionService {
	public abstract boolean crear(EInstitucion institucion);
	public abstract boolean actualizar(EInstitucion institucion);
	public abstract boolean borrar(long id);
	public abstract List<MInstitucion> obtener();
	public abstract MInstitucion obtener(long id);
}
