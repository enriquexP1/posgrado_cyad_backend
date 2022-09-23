package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



/**
 * clase entidad representa la entidad Articulo
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="ARTICULO")
@Entity
public class EArticulo implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	@Column(name="DOI")
	private String doi;
	@Column(name="TITULO")
	private String titulo;
	@Column(name="AÑO_PUBLICACION")
	private int año_publicacion;
	@Column(name="PAGINA_INICIO")
	private int pagina_inicio;
	@Column(name="PAGINA_FIN")
	private int pagina_fin;
	
	@OneToOne(mappedBy ="articulo")
	@JsonIgnore
	private EArticuloPalabrasPuente articulo;
	
	@ManyToOne
	@JoinColumn(name="REVISTA")
	private ERevista revista;
	
	
	public EArticulo()
	{
		
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public ERevista getRevista() {
		return revista;
	}

	public void setRevista(ERevista revista) {
		this.revista = revista;
	}
	
	
}
