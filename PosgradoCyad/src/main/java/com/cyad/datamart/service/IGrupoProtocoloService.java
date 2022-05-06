package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.entity.EGrupoProtocoloDatamart;
import com.cyad.datamart.model.MGrupoProtocoloDatamart;

public interface IGrupoProtocoloService {
	public abstract boolean crear(EGrupoProtocoloDatamart grupo);

	public abstract boolean actualizar();

	public abstract boolean borrar(long id);

	public abstract List<MGrupoProtocoloDatamart> obtener();
}
