package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.model.MAutor;

public interface IAutorService {
	public abstract boolean crear(EAutor autor);
	public abstract boolean actualizar(EAutor autor);
	public abstract boolean borrar(long id);
	public abstract List<MAutor> obtener();
}
