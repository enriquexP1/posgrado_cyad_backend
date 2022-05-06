package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EEstadoAcademico;
import com.cyad.posgrado.model.MEstadoAcademico;

@Component("convertidor_estados")
public class ConvertidorEstadoAcademico {
	public List<MEstadoAcademico> convertirLista(List<EEstadoAcademico> eestados){
		List<MEstadoAcademico> mestados = new ArrayList<>();
		for(EEstadoAcademico estaado : eestados) {
			mestados.add(new MEstadoAcademico(estaado));
		}
		return mestados;
	}
}
