package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EParticipante;
import com.cyad.posgrado.model.MParticipante;

public interface IParticipanteService {
	public abstract boolean crear(EParticipante participante);
	public abstract boolean actualizar(EParticipante participante);
	public abstract boolean borrar(long id);
	public abstract List<MParticipante> obtener();
	public abstract MParticipante obtener(long id);
}
