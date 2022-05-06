package com.cyad.datamart.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.datamart.entity.EProyectoDatamart;
import com.cyad.datamart.model.MProyectoDatamart;

@Component("data_convertidor_proyecto")
public class ConvertidorProyectoDatamart {
	public List<MProyectoDatamart> convertirLista(List<EProyectoDatamart> e_proyectos){
		List<MProyectoDatamart> m_proyectos = new ArrayList<MProyectoDatamart>();
		for(EProyectoDatamart proyecto : e_proyectos)
			m_proyectos.add(new MProyectoDatamart(proyecto));
		
		return m_proyectos;
	}
}
