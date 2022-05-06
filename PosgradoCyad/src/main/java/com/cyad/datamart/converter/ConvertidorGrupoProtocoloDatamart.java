package com.cyad.datamart.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.datamart.entity.EGrupoProtocoloDatamart;
import com.cyad.datamart.model.MGrupoProtocoloDatamart;

@Component("data_convertidor_grupo")
public class ConvertidorGrupoProtocoloDatamart {
	public List<MGrupoProtocoloDatamart> convertirLista(List<EGrupoProtocoloDatamart> e_grupos){
		List<MGrupoProtocoloDatamart> m_grupos = new ArrayList<MGrupoProtocoloDatamart>();
		for(EGrupoProtocoloDatamart grupo : e_grupos)
			m_grupos.add(new MGrupoProtocoloDatamart(grupo));
		
		return m_grupos;
	}
}
