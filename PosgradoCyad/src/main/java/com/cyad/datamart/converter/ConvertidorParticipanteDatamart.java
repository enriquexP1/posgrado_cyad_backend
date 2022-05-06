package com.cyad.datamart.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.datamart.entity.EParticipanteDatamart;
import com.cyad.datamart.model.MParticipanteDatamart;

@Component("data_convertidor_participante")
public class ConvertidorParticipanteDatamart {
	public List<MParticipanteDatamart> convertirLista(List<EParticipanteDatamart> e_participantes){
		List<MParticipanteDatamart> m_participantes = new ArrayList<MParticipanteDatamart>();
		for(EParticipanteDatamart partiocipante : e_participantes)
			m_participantes.add(new MParticipanteDatamart(partiocipante));
		
		return m_participantes;
	}
}
