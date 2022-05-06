package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EAreaConcentracion;
import com.cyad.posgrado.model.MAreaConcentracion;

public interface IAreaConcentracionService {
	public abstract boolean crear(EAreaConcentracion area);
	public abstract boolean actualizar(EAreaConcentracion area);
	public abstract boolean borrar(long id);
	public abstract List<MAreaConcentracion> obtener();
	public abstract MAreaConcentracion obtener(long id);
}
