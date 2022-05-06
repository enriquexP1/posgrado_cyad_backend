package com.cyad.aspirantes.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.aspirantes.entity.EAdeudoAspirante;
import com.cyad.aspirantes.model.MAdeudoAspirante;

@Component("convertidor_adeudo_aspirante")
public class ConvertidorAdeudoAspirante {
	public List<MAdeudoAspirante> convertirLista(List<EAdeudoAspirante> eadeudos){
		List<MAdeudoAspirante> madeudos = new ArrayList<>();
		for(EAdeudoAspirante adeudo : eadeudos) {
			madeudos.add(new MAdeudoAspirante(adeudo));
		}
		return madeudos;
	}
}
