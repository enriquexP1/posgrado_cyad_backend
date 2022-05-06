package com.cyad.datamart.model;

import java.util.ArrayList;
import java.util.List;

import com.cyad.datamart.entity.EGrupoProtocoloDatamart;
import com.cyad.datamart.entity.EParticipanteDatamart;

public class MGrupoProtocoloDatamart {
	private long id;
	private MProyectoDatamart proyecto;
	private List<MParticipanteDatamart> participantes;

	public MGrupoProtocoloDatamart(EGrupoProtocoloDatamart grupo) {
		super();
		this.id = grupo.getId();
		if (grupo.getParticipantes() != null) {
			this.participantes = new ArrayList<MParticipanteDatamart>();
			for(EParticipanteDatamart participante : grupo.getParticipantes())
				this.participantes.add(new MParticipanteDatamart(participante));
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public MProyectoDatamart getProyecto() {
		return proyecto;
	}

	public void setProyecto(MProyectoDatamart proyecto) {
		this.proyecto = proyecto;
	}

	public List<MParticipanteDatamart> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<MParticipanteDatamart> participantes) {
		this.participantes = participantes;
	}

}
