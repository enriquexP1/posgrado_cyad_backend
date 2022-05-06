package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EDatosAcademicos;
import com.cyad.posgrado.model.MDatosAcademicos;

public interface IDatosAcademicosService {
	public abstract boolean crear(EDatosAcademicos datos);
	public abstract boolean actualizar(EDatosAcademicos datos);
	public abstract boolean borrar(long id);
	public abstract List<MDatosAcademicos> obtener();
	public abstract MDatosAcademicos obtener(long id);
}
