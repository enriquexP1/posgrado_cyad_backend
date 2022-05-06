package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ENivel;

@Repository("repositorio_nivel")
public interface NivelRepository extends JpaRepository<ENivel, Serializable> {
	public abstract ENivel findById(long id);
	public abstract ENivel findByNivel(String nivel);
}
