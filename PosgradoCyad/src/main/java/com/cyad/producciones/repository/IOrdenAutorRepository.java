package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EOrdenAutor;

@Repository("repositorio_orden_autor")
public interface IOrdenAutorRepository extends JpaRepository<EOrdenAutor, Serializable> {
	public abstract EOrdenAutor findById(long id);
}
