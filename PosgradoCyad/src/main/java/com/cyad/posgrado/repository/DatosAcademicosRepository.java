package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EDatosAcademicos;

@Repository("repositorio_datos_academicos")
public interface DatosAcademicosRepository extends JpaRepository<EDatosAcademicos, Serializable> {
	public abstract EDatosAcademicos findById(long id);

}
