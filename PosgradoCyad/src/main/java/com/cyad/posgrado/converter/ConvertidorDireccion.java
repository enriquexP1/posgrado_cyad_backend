package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EDireccion;
import com.cyad.posgrado.model.MDireccion;

@Component("convertidor_direcciones")
public class ConvertidorDireccion {
	public List<MDireccion> convertirLista(List<EDireccion> edirecciones){
		List<MDireccion> mdirecciones = new ArrayList<>();
		for(EDireccion direccion : edirecciones) {
			mdirecciones.add(new MDireccion(direccion));
		}
		return mdirecciones;
	}
}
