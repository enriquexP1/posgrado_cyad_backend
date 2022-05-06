package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.entity.ETrimestreDatamart;
import com.cyad.datamart.model.MTrimestreDatamart;

public interface ITrimestreService {
	public abstract boolean crear(ETrimestreDatamart alumno);

	public abstract boolean actualizar();

	public abstract boolean borrar(long id);

	public abstract List<MTrimestreDatamart> obtener();
}
