package com.cyad.aspirantes.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.aspirantes.entity.EEstadoAspirante;
import com.cyad.aspirantes.model.MEstadoAspirante;

@Component("convertidor_estado_aspirante")
public class ConvertidorEstadoAspirante {
	public List<MEstadoAspirante> convertirLista(List<EEstadoAspirante> eestados){
		List<MEstadoAspirante> mestados = new ArrayList<>();
		for(EEstadoAspirante estado : eestados) {
			mestados.add(new MEstadoAspirante(estado));
		}
		return mestados;
	}
}
