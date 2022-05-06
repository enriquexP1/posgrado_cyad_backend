package com.cyad.datamart.model;

import com.cyad.datamart.entity.EProyectoDatamart;

public class MProyectoDatamart {
	private long id;
	private String titulo;
	private MGrupoProtocoloDatamart grupo;
	
	public MProyectoDatamart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MProyectoDatamart(EProyectoDatamart proyecto) {
		super();
		this.id = proyecto.getId();
		this.titulo = proyecto.getTitulo();
		if(proyecto.getGrupo() != null)
		this.grupo = new MGrupoProtocoloDatamart (proyecto.getGrupo());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public MGrupoProtocoloDatamart getGrupo() {
		return grupo;
	}

	public void setGrupo(MGrupoProtocoloDatamart grupo) {
		this.grupo = grupo;
	}

	
}
