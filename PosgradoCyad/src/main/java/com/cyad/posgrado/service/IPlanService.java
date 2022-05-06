package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EPlan;
import com.cyad.posgrado.model.MPlan;

public interface IPlanService {
	public abstract boolean crear(EPlan plan);
	public abstract boolean actualizar(EPlan plan);
	public abstract boolean borrar(long id);
	public abstract List<MPlan> obtener();
	public abstract MPlan obtener(long id);
}
