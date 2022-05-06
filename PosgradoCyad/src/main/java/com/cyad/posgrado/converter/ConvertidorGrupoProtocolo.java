package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EGrupoProtocolo;
import com.cyad.posgrado.model.MGrupoProtocolo;

@Component("convertidor_grupo_protocolo")
public class ConvertidorGrupoProtocolo {
	public List<MGrupoProtocolo> convertirLista(List<EGrupoProtocolo> egrupos){
		List<MGrupoProtocolo> mgrupos = new ArrayList<>();
		for(EGrupoProtocolo grupo : egrupos) {
			mgrupos.add(new MGrupoProtocolo(grupo));
		}
		return mgrupos;
	}
}
