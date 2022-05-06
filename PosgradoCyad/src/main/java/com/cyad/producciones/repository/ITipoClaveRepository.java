package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.ETipoClave;

@Repository("repositorio_tipo_clave")
public interface ITipoClaveRepository extends JpaRepository<ETipoClave, Serializable>  {
	public abstract ETipoClave findById(long id);
}
