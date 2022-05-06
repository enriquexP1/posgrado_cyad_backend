package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccion;
import com.cyad.producciones.model.MProduccion;

@Component("convertidor_producciones")
public class ConvertidorProduccion {
	public List<MProduccion> convertirLista(List<EProduccion> eproducciones){
		List<MProduccion> mproducciones = new ArrayList<>();
		for(EProduccion produccion : eproducciones) {
			mproducciones.add(new MProduccion(produccion));
		}
		return mproducciones;
	}
}
