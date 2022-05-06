package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.ETipoParticipante;
import com.cyad.posgrado.model.MTipoParticipante;

public interface ITipoParticipanteService {
	public abstract boolean crear(ETipoParticipante tipo);
	public abstract boolean actualizar(ETipoParticipante tipo);
	public abstract boolean borrar(long id);
	public abstract List<MTipoParticipante> obtener();
	public abstract MTipoParticipante obtener(long id);
}
