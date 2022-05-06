package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EOrdenAutor;
import com.cyad.producciones.model.MOrdenAutor;

public interface IOrdenAutorService {
	public abstract boolean crear(EOrdenAutor orden);
	public abstract boolean actualizar(EOrdenAutor orden);
	public abstract boolean borrar(long id);
	public abstract List<MOrdenAutor> obtener();
	public abstract MOrdenAutor obtener(long id);
}
