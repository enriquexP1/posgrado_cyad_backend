package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EDepartamento;
import com.cyad.posgrado.model.MDepartamento;

public interface IDepartamentoService {
	public abstract boolean crear(EDepartamento departamento);
	public abstract boolean actualizar(EDepartamento departamento);
	public abstract boolean borrar(long id);
	public abstract List<MDepartamento> obtener();
	public abstract MDepartamento obtener(long id);
}
