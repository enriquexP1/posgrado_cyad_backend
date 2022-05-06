package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EInstitucion;

@Repository("repositorio_instituciones")
public interface InstitucionRepository extends JpaRepository<EInstitucion, Serializable>{
	public abstract EInstitucion findById(long id);
	public abstract EInstitucion findByInstitucion(String division);
}
