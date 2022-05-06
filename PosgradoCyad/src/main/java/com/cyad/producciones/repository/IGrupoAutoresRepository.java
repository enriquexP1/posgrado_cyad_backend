package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EGrupoAutores;

@Repository("repositorio_grupo_autores")
public interface IGrupoAutoresRepository extends JpaRepository<EGrupoAutores, Serializable> {
	public abstract EGrupoAutores findById(long id);
}
