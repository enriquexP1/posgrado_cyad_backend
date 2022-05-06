package com.cyad.posgrado.model;

import java.util.List;

import com.cyad.posgrado.entity.EInstitucion;

public class MInstitucion {
	private long id;
	private String institucion;
	private boolean activo;
	private List<MProfesor> profesores;
	
	public MInstitucion() {
		
	}
	
	public MInstitucion(EInstitucion institucion) {
		super();
		this.id = institucion.getId();
		this.institucion = institucion.getInstitucion();
		this.activo = institucion.isActivo();
		//this.profesores = convertProfesores(institucion.getProfesores());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public List<MProfesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<MProfesor> profesores) {
		this.profesores = profesores;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
}
