package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ETrimestre;

@Repository("repositorio_trimestres")
public interface TrimestreRepository extends JpaRepository<ETrimestre ,Serializable>{
	public abstract ETrimestre findById(long id);
}
