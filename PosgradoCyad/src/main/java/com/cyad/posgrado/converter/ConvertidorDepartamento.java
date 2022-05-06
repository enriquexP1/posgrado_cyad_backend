package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EDepartamento;
import com.cyad.posgrado.model.MDepartamento;

@Component("convertidor_departamento")
public class ConvertidorDepartamento {
	
	public List<MDepartamento> convertirLista(List<EDepartamento> departamentos){
		List<MDepartamento> mdepartamentos = new ArrayList<>();
		for(EDepartamento departamento : departamentos) {
			mdepartamentos.add(new MDepartamento(departamento));
		}
		return mdepartamentos;
	}
		
}
