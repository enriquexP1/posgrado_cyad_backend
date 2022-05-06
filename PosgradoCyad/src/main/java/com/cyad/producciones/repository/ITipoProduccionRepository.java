package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.ETipoProduccion;

@Repository("repositorio_tipo_produccion")
public interface ITipoProduccionRepository extends JpaRepository<ETipoProduccion, Serializable> {
	public abstract ETipoProduccion findById(long id);
}
