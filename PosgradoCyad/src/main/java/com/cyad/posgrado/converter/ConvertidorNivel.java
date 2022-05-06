package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.ENivel;
import com.cyad.posgrado.model.MNivel;

@Component("convertidor_niveles")
public class ConvertidorNivel {
	public List<MNivel> convertirLista(List<ENivel> eniveles){
		List<MNivel> mniveles = new ArrayList<>();
		for(ENivel nivel : eniveles) {
			mniveles.add(new MNivel(nivel));
		}
		return mniveles;
	}
}
