package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EAutor;

@Repository("repositorio_autor")
public interface IAutorRepository extends JpaRepository<EAutor, Serializable>  {
	public abstract EAutor findById(long id);
}
