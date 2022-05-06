package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EDatosIngreso;
import com.cyad.posgrado.model.MDatosIngreso;

public interface IDatosIngresoService {
	public abstract boolean crear(EDatosIngreso datos);
	public abstract boolean actualizar(EDatosIngreso datos);
	public abstract boolean borrar(long id);
	public abstract List<MDatosIngreso> obtener();
	public abstract MDatosIngreso obtener(long id);
}
