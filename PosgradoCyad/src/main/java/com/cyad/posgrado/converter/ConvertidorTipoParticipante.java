package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.ETipoParticipante;
import com.cyad.posgrado.model.MTipoParticipante;

@Component("convertidor_tipos_participantes")
public class ConvertidorTipoParticipante {
	public List<MTipoParticipante> convertirLista(List<ETipoParticipante> tparticipantes){
		List<MTipoParticipante> mtparticipantes = new ArrayList<>();
		for(ETipoParticipante tipo : tparticipantes) {
			mtparticipantes.add(new MTipoParticipante(tipo));
		}
		return mtparticipantes;
	}
}
