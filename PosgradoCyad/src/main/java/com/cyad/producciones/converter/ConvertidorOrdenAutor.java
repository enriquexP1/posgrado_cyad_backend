package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EOrdenAutor;
import com.cyad.producciones.model.MOrdenAutor;

@Component("convertidor_orden_autor")
public class ConvertidorOrdenAutor {
	
	public List<MOrdenAutor> convertirLista(List<EOrdenAutor> eordenes){
		List<MOrdenAutor> mordenes = new ArrayList<>();
		for(EOrdenAutor orden : eordenes) {
			mordenes.add(new MOrdenAutor(orden));
		}
		return mordenes;
	}

}
