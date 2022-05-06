package com.cyad.posgrado.model;

import java.util.ArrayList;
import java.util.List;

import com.cyad.posgrado.entity.EGrupoProtocolo;
import com.cyad.posgrado.entity.EParticipante;

public class MGrupoProtocolo {
	private long id;
	private String clave;
	private boolean activo;
	private List<MParticipante> participantes;
	
	public MGrupoProtocolo() {
		super();
	}
		

	public MGrupoProtocolo(EGrupoProtocolo grupo) {
		super();
		this.id = grupo.getId();
		this.clave = grupo.getClave();
		this.activo = grupo.isActivo();
		
		if(grupo.getParticipantes() != null) {
			System.out.print("si hay participantes");
			this.participantes = new ArrayList<MParticipante>();
			
			for(EParticipante participante : grupo.getParticipantes()) {
				this.participantes.add(new MParticipante(participante));
			}
			
		}
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public List<MParticipante> getParticipantes() {
		return participantes;
	}


	public void setParticipantes(List<MParticipante> participantes) {
		this.participantes = participantes;
	}
	
	
	
	
}
