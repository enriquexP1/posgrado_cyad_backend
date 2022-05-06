package com.cyad.datamart.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.datamart.entity.ETrayectoriaDatamart;
import com.cyad.datamart.model.MTrayectoriaDatamart;

@Component("data_convertidor_trimestre")
public class ConvertidorTrimestreDatamart {
	public List<MTrayectoriaDatamart> convertirLista(List<ETrayectoriaDatamart> e_trayectorias){
		List<MTrayectoriaDatamart> m_trayectorias = new ArrayList<MTrayectoriaDatamart>();
		for(ETrayectoriaDatamart trayectoria : e_trayectorias)
			m_trayectorias.add(new MTrayectoriaDatamart(trayectoria));
		
		return m_trayectorias;
	}
}
