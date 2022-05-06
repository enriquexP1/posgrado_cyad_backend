package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EDireccion;
import com.cyad.posgrado.model.MDireccion;

public interface IDireccionService {
	public abstract boolean crear(EDireccion direccion);
	public abstract boolean actualizar(EDireccion direccion);
	public abstract boolean borrar(long id);
	public abstract List<MDireccion> obtener();
	public abstract MDireccion obtener(long id);
}