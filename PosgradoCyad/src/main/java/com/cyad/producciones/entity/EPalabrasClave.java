package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * clase entidad representa el catalogo de Palabras clave
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "CAT_PALABRAS_CLAVE")
@Entity
public class EPalabrasClave implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "PALABRA")
	private String palabra;

	@OneToOne(mappedBy = "palabraArticulo")
	@JsonIgnore
	private EArticuloPalabrasPuente palabraClave;
	
	@OneToOne(mappedBy = "palabraLibro")
	@JsonIgnore
	private ELibroPalabrasPuente palabraClave2;
	
	@OneToOne(mappedBy = "palabraMemoria")
	@JsonIgnore
	private EMemoriaPalabrasPuente palabraClave3;
	
	
	@OneToOne(mappedBy = "palabraReporte")
	@JsonIgnore
	private EReportePalabrasPuente palabraClave4;
	
	@OneToOne(mappedBy = "palabraDocumentoReseña")
	@JsonIgnore
	private EDocumentoReseñaPalabrasPuente palabraClave5;
	
	
	public EPalabrasClave() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



}
