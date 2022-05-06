package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ETipoAutor;
import com.cyad.producciones.model.MTipoAutor;

@Component("convertidor_tipo_autor")
public class ConvertidorTipoAutor {

	public List<MTipoAutor > convertirLista(List<ETipoAutor > etiposAutor){
		List<MTipoAutor > mtiposAutor = new ArrayList<>();
		for(ETipoAutor  tipoAutor : etiposAutor) {
			mtiposAutor.add(new MTipoAutor (tipoAutor));
		}
		return mtiposAutor;
	}
	
}
