package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EDivision;
import com.cyad.posgrado.model.MDivision;

public interface IDivisionService {
	public abstract boolean crear(EDivision division);
	public abstract boolean actualizar(EDivision division);
	public abstract boolean borrar(long id);
	public abstract List<MDivision> obtener();
}
