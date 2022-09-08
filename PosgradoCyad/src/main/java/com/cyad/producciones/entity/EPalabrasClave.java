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

	@OneToOne(mappedBy = "palabra")
	@JsonIgnore
	private EArticuloPalabrasPuente palabraClave;

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

	public EArticuloPalabrasPuente getPalabraClave() {
		return palabraClave;
	}

	public void setPalabraClave(EArticuloPalabrasPuente palabraClave) {
		this.palabraClave = palabraClave;
	}

}
