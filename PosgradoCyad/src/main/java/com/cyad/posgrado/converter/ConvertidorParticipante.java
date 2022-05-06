package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EParticipante;
import com.cyad.posgrado.model.MParticipante;

@Component("convertidor_participantes")
public class ConvertidorParticipante {
	public List<MParticipante> convertirLista(List<EParticipante> eparticipantes){
		List<MParticipante> mparticipantes = new ArrayList<>();
		for(EParticipante participante : eparticipantes) {
			mparticipantes.add(new MParticipante(participante));
		}
		return mparticipantes;
	}
}
