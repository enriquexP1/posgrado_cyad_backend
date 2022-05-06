package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ETipoProduccion;
import com.cyad.producciones.model.MTipoProduccion;

@Component("convertidor_tipo_produccion")
public class ConvertidorTipoProduccion {
	
	public List<MTipoProduccion > convertirLista(List<ETipoProduccion > etipos){
		List<MTipoProduccion > mtipos = new ArrayList<>();
		for(ETipoProduccion  tipo : etipos) {
			mtipos.add(new MTipoProduccion (tipo));
		}
		return mtipos;
	}
}
