package com.cyad.posgrado.model;

import com.cyad.posgrado.entity.EAreaConcentracion;

public class MAreaConcentracion {
	private long id;
	private String area;
	private boolean activo;
	//private List<EDatosAcademicos> datos;
	
	public MAreaConcentracion() {
		super();
	}

	public MAreaConcentracion(EAreaConcentracion area) {
		super();
		this.id = area.getId();
		this.area = area.getArea();
		this.activo = area.isActivo();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	/*public List<EDatosAcademicos> getDatos() {
		return datos;
	}

	public void setDatos(List<EDatosAcademicos> datos) {
		this.datos = datos;
	}*/

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
}
