package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.ERol;
import com.cyad.posgrado.model.MRol;

@Component("convertidor_rol")
public class ConvertidorRol {
	public List<MRol> convertirLista(List<ERol> roles){
		List<MRol> mroles = new ArrayList<>();
		for(ERol rol : roles) {
			mroles.add(new MRol(rol));
		}
		return mroles;
	}
}
