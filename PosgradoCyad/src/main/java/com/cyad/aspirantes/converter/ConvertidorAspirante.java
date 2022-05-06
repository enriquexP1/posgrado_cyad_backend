package com.cyad.aspirantes.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.aspirantes.entity.EAspirante;
import com.cyad.aspirantes.model.MAspirante;

@Component("convertidor_aspirante")
public class ConvertidorAspirante {
	public List<MAspirante> convertirLista(List<EAspirante> easpirantes){
		List<MAspirante> maspirantes = new ArrayList<>();
		for(EAspirante aspirante : easpirantes) {
			maspirantes.add(new MAspirante(aspirante));
		}
		return maspirantes;
	}
}
