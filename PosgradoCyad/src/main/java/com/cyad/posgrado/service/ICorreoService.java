package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.ECorreo;
import com.cyad.posgrado.model.MCorreo;

public interface ICorreoService {
	public abstract boolean crear(ECorreo correo);
	public abstract boolean actualizar(ECorreo correo);
	public abstract boolean borrar(long id);
	public abstract List<MCorreo> obtener();
	public abstract MCorreo obtener(long id);
}
