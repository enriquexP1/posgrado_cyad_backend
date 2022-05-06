package com.cyad.posgrado.model;

import java.util.List;

import com.cyad.posgrado.entity.EDivision;

public class MDivision{
	private long id;
	private String division;
	private boolean activo;
	private List<MProfesor> profesores;
	
	
	public MDivision() {
		
	}

	
	public MDivision(EDivision division) {
		super();
		this.id = division.getId();
		this.division = division.getDivision();
		this.activo = division.isActivo();
		//this.profesores = convertProfesores(division.getProfesores());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
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
