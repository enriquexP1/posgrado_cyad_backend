package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EProyecto;
import com.cyad.posgrado.model.MProyecto;

@Component("convertidor_proyectos")
public class ConvertidorProyecto {
	public List<MProyecto> convertirLista(List<EProyecto> eproyectos){
		List<MProyecto> mproyectos = new ArrayList<>();
		for(EProyecto proyecto : eproyectos) {
			mproyectos.add(new MProyecto(proyecto));
		}
		return mproyectos;
	}
}
