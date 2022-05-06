package com.cyad.posgrado.model;

import com.cyad.posgrado.entity.EEstadoAcademico;

public class MEstadoAcademico {
	private long id;
	private String estado;
	private boolean activo;
	//private List<MDatosAcademicos> datos;
	
	public MEstadoAcademico() {
		super();
	}

	public MEstadoAcademico(EEstadoAcademico estadoAcademico) {
		this.id = estadoAcademico.getId();
		this.estado = estadoAcademico.getEstado();
		this.activo = estadoAcademico.isActivo();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	/*public List<MDatosAcademicos> getDatos() {
		return datos;
	}

	public void setDatos(List<MDatosAcademicos> datos) {
		this.datos = datos;
	}*/

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
	
}
