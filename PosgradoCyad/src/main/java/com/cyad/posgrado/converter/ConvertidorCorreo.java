package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.ECorreo;
import com.cyad.posgrado.model.MCorreo;

@Component("convertidor_correos")
public class ConvertidorCorreo {
	public List<MCorreo> convertirLista(List<ECorreo> ecorreos){
		List<MCorreo> mcorreos = new ArrayList<>();
		for(ECorreo correo : ecorreos) {
			mcorreos.add(new MCorreo(correo));
		}
		return mcorreos;
	}
}
