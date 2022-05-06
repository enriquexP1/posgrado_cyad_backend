package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EAdeudo;
import com.cyad.posgrado.model.MAdeudo;

public interface IAdeudoService {
	public abstract boolean crear(EAdeudo adeudo);
	public abstract boolean actualizar(EAdeudo adeudo);
	public abstract boolean borrar(long id);
	public abstract List<MAdeudo> obtener();
}
