package com.cyad.posgrado.model;

import com.cyad.posgrado.entity.ERol;

public class MRol {
	private long id;
	private String rol;
	private boolean activo;
	
	public MRol() {
		super();
	}
	
	public MRol(ERol rol) {
		super();
		this.id = rol.getId();
		this.rol = rol.getRol();
		this.activo = rol.isActivo();
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
