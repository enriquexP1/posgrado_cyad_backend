package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EDatosAcademicos;
import com.cyad.posgrado.model.MDatosAcademicos;

@Component("convertidor_datos_academicos")
public class ConvertidorDatosAcademicos {
	public List<MDatosAcademicos> convertirLista(List<EDatosAcademicos> edatos){
		List<MDatosAcademicos> mDatosAcademicoss = new ArrayList<>();
		for(EDatosAcademicos DatosAcademicos : edatos) {
			mDatosAcademicoss.add(new MDatosAcademicos(DatosAcademicos));
		}
		return mDatosAcademicoss;
	}
}
