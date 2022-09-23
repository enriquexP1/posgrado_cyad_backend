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
 * clase entidad representa la entidad Origen reporte
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "CAT_ORIGEN_REPORTE")
@Entity
public class EOrigenReporte implements Serializable{
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name="ORIGEN")
	private String origen;
	@OneToOne(mappedBy="origenReporte")
	@JsonIgnore
	private EReporte reporte;
	
	public EOrigenReporte()
	{
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public EReporte getReporte() {
		return reporte;
	}
	public void setReporte(EReporte reporte) {
		this.reporte = reporte;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
