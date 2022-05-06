package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EAdeudo;
import com.cyad.posgrado.model.MAdeudo;

@Component("convertidor_adeudos")
public class ConvertidorAdeudo {
	public List<MAdeudo> convertirLista(List<EAdeudo> eadeudos){
		List<MAdeudo> madeudos = new ArrayList<>();
		for(EAdeudo adeudo : eadeudos) {
			madeudos.add(new MAdeudo(adeudo));
		}
		return madeudos;
	}
}
