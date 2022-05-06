package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EDivision;
import com.cyad.posgrado.model.MDivision;

@Component("convertidor_division")
public class ConvertidorDivision {
	public List<MDivision> convertirLista(List<EDivision> edivisiones){
		List<MDivision> mdivisiones = new ArrayList<>();
		for(EDivision vision : edivisiones) {
			mdivisiones.add(new MDivision(vision));
		}
		return mdivisiones;
	}
}
