package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EGrupoProtocolo;
import com.cyad.posgrado.model.MGrupoProtocolo;

public interface IGrupoProtocoloService {
	public abstract boolean crear(EGrupoProtocolo grupo);
	public abstract MGrupoProtocolo crear();
	public abstract boolean actualizar(EGrupoProtocolo grupo);
	public abstract boolean borrar(long id);
	public abstract List<MGrupoProtocolo> obtener();
	public abstract MGrupoProtocolo obtener(long id);
	public abstract boolean search(String clave);
}
