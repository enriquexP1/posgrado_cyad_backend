package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.ETrimestre;
import com.cyad.posgrado.model.MTrimestre;

@Component("convertidor_trimestres")
public class ConvertidorTrimestre {
	public List<MTrimestre> convertirLista(List<ETrimestre> etrimestres){
		List<MTrimestre> mtrimestres = new ArrayList<>();
		for(ETrimestre trimestre : etrimestres) {
			mtrimestres.add(new MTrimestre(trimestre));
		}
		return mtrimestres;
	}
}
