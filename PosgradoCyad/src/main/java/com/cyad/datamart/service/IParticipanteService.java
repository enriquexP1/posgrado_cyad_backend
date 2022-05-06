package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.entity.EParticipanteDatamart;
import com.cyad.datamart.model.MParticipanteDatamart;

public interface IParticipanteService {
	public abstract boolean crear(EParticipanteDatamart participante);

	public abstract boolean actualizar();

	public abstract boolean borrar(long id);

	public abstract List<MParticipanteDatamart> obtener();
}
