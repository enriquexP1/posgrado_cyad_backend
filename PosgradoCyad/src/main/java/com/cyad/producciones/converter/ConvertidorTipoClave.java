package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ETipoClave;
import com.cyad.producciones.model.MTipoClave;

@Component("convertidor_tipo_clave")
public class ConvertidorTipoClave {

	public List<MTipoClave > convertirLista(List<ETipoClave > eclavesAutor){
		List<MTipoClave > mclavesAutor = new ArrayList<>();
		for(ETipoClave  claveAutor : eclavesAutor) {
			mclavesAutor.add(new MTipoClave (claveAutor));
		}
		return mclavesAutor;
	}
	
}
