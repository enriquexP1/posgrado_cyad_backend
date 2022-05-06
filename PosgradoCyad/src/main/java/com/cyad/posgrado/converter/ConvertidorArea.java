package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EAreaInvestigacion;
import com.cyad.posgrado.model.MAreaInvestigacion;

@Component("convertidor_areas")
public class ConvertidorArea {
	public List<MAreaInvestigacion> convertirLista(List<EAreaInvestigacion> eareas){
		List<MAreaInvestigacion> mareas = new ArrayList<>();
		for(EAreaInvestigacion area : eareas) {
			mareas.add(new MAreaInvestigacion(area));
		}
		return mareas;
	}
}
