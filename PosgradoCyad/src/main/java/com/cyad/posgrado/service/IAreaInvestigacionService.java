package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EAreaInvestigacion;
import com.cyad.posgrado.model.MAreaInvestigacion;

public interface IAreaInvestigacionService {
	public abstract boolean crear(EAreaInvestigacion area);
	public abstract boolean actualizar(EAreaInvestigacion area);
	public abstract boolean borrar(long id);
	public abstract List<MAreaInvestigacion> obtener();
	public abstract MAreaInvestigacion obtener(long id);
}
