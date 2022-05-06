package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EProfesor;
import com.cyad.posgrado.model.MProfesor;

@Component("convertidor_profesor")
public class ConvertidorProfesor {
	
	public List<MProfesor> convertirLista(List<EProfesor> profesores){
		List<MProfesor> mprofesores = new ArrayList<>();
		for(EProfesor profesor : profesores) {
			mprofesores.add(new MProfesor(profesor));
		}
		return mprofesores;
	}
}
