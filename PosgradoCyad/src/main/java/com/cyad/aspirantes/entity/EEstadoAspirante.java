package com.cyad.aspirantes.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name="CAT_ESTADO_ASPIRANTE")
@Entity
public class EEstadoAspirante implements Serializable{
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	
	@Column(name="ESTADO")
	private String estado;
	
	@Column(name="ACTIVO")
	private boolean activo;
	
	@OneToMany(mappedBy = "estado")
	@JsonIgnore
	private List<EAspirante> aspirantes;

	public EEstadoAspirante() {
		super();
		this.activo = true;
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

	public List<EAspirante> getAspirantes() {
		return aspirantes;
	}

	public void setAspirantes(List<EAspirante> aspirantes) {
		this.aspirantes = aspirantes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
	
	
}
