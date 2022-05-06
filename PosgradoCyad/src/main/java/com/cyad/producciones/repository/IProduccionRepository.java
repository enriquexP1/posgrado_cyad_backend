package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EProduccion;

@Repository("repositorio_produccion")
public interface IProduccionRepository extends JpaRepository<EProduccion, Serializable> {
	public abstract EProduccion findById(long id);
	
}
