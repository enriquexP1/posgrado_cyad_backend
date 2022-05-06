package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.model.MAutor;

@Component("convertidor_autor")
public class ConvertidorAutor {

	public List<MAutor> convertirLista(List<EAutor> eautores){
		List<MAutor > mautores = new ArrayList<>();
		for(EAutor  autor : eautores) {
			mautores.add(new MAutor (autor));
		}
		return mautores;
	}

}
