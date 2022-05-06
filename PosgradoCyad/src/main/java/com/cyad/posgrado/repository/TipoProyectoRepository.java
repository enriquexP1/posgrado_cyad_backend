package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ETipoProyecto;

@Repository("repositorio_tipo_proyecto")
public interface TipoProyectoRepository extends JpaRepository<ETipoProyecto,Serializable>{
	public abstract ETipoProyecto findById(long id);
	public abstract ETipoProyecto findByTipo(String tipo);
}
