package com.cyad.datamart.service;

import java.util.List;

import com.cyad.datamart.entity.EDatosPorTrimestreDatamart;
import com.cyad.datamart.model.MDatosPorTrimestreDatamart;

public interface IDatosPorTrimestreService {
	public abstract boolean crear(EDatosPorTrimestreDatamart datos);

	public abstract boolean actualizar();

	public abstract boolean borrar(long id);

	public abstract List<MDatosPorTrimestreDatamart> obtener();
}
