package com.cyad.producciones.model;

import com.cyad.producciones.entity.EArticuloPalabrasPuente;
import com.cyad.producciones.entity.EPalabrasClave;

public class MPalabrasClave {
	private long id;
	private String palabra;
	private EArticuloPalabrasPuente palabraClave;

	public MPalabrasClave(EPalabrasClave palabras) {
		this.id = palabras.getId();
		this.palabra = palabras.getPalabra();
		this.palabraClave = palabras.getPalabraClave();
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

	public EArticuloPalabrasPuente getPalabraClave() {
		return palabraClave;
	}

	public void setPalabraClave(EArticuloPalabrasPuente palabraClave) {
		this.palabraClave = palabraClave;
	}

}
