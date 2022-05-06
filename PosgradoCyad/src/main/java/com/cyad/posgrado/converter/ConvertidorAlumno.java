package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EAlumno;
import com.cyad.posgrado.model.MAlumno;

@Component("convertidor_alumnos")
public class ConvertidorAlumno {
	public List<MAlumno> convertirLista(List<EAlumno> ealumnos){
		List<MAlumno> malumnos = new ArrayList<>();
		for(EAlumno elumno : ealumnos) {
			malumnos.add(new MAlumno(elumno));
		}
		return malumnos;
	}
}
