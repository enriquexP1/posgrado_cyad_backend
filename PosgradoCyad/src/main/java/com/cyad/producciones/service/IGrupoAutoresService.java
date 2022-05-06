package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EGrupoAutores;
import com.cyad.producciones.model.MGrupoAutores;

public interface IGrupoAutoresService {
	public abstract boolean crear(EGrupoAutores autores);
	public abstract boolean actualizar(EGrupoAutores autores);
	public abstract boolean borrar(long id);
	public abstract List<MGrupoAutores> obtener();
	public abstract MGrupoAutores obtener(long id);
}
