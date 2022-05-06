package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.ETipoProyecto;
import com.cyad.posgrado.model.MTipoProyecto;

@Component("convertidor_tipos_proyectos")
public class ConvertidorTipoProyecto {
	public List<MTipoProyecto> convertirLista(List<ETipoProyecto> etipos){
		List<MTipoProyecto> mtipos = new ArrayList<>();
		for(ETipoProyecto tipo : etipos) {
			mtipos.add(new MTipoProyecto(tipo));
		}
		return mtipos;
	}
}
