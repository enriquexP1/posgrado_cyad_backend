package com.cyad.producciones.model;

import com.cyad.producciones.entity.EArticuloPalabrasPuente;
import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.entity.ERevista;

public class MArticulo {
	private long id;
	private String doi;
	private String titulo;
	private int año_publicacion;
	private int pagina_inicio;
	private int pagina_fin;

	private EArticuloPalabrasPuente articulopuente;

	private ERevista revista;

	public MArticulo(EArticulo articulo) {
		this.id = articulo.getId();
		this.doi = articulo.getDoi();
		this.titulo = articulo.getTitulo();
		this.año_publicacion = articulo.getAño_publicacion();
		this.pagina_inicio = articulo.getPagina_inicio();
		this.pagina_fin = articulo.getPagina_fin();
		this.articulopuente = articulo.getArticulo();
		this.revista = articulo.getRevista();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño_publicacion() {
		return año_publicacion;
	}

	public void setAño_publicacion(int año_publicacion) {
		this.año_publicacion = año_publicacion;
	}

	public int getPagina_inicio() {
		return pagina_inicio;
	}

	public void setPagina_inicio(int pagina_inicio) {
		this.pagina_inicio = pagina_inicio;
	}

	public int getPagina_fin() {
		return pagina_fin;
	}

	public void setPagina_fin(int pagina_fin) {
		this.pagina_fin = pagina_fin;
	}

	public EArticuloPalabrasPuente getArticulopuente() {
		return articulopuente;
	}

	public void setArticulopuente(EArticuloPalabrasPuente articulopuente) {
		this.articulopuente = articulopuente;
	}

	public ERevista getRevista() {
		return revista;
	}

	public void setRevista(ERevista revista) {
		this.revista = revista;
	}

}
