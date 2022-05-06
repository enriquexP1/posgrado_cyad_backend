package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EInstitucion;
import com.cyad.posgrado.model.MInstitucion;

@Component("convertidor_instituciones")
public class ConvertidorInstituciones {
	public List<MInstitucion> convertirLista(List<EInstitucion> einstituciones){
		List<MInstitucion> minstituciones = new ArrayList<>();
		for(EInstitucion institucion : einstituciones) {
			minstituciones.add(new MInstitucion(institucion));
		}
		return minstituciones;
	}
}
