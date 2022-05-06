package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.ETipoAutor;

@Repository("repositorio_tipo_autor")
public interface ITipoAutorRepository extends JpaRepository<ETipoAutor, Serializable> {
	public abstract ETipoAutor findById(long id);
}
