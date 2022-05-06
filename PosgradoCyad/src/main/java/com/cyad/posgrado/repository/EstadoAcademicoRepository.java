package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EEstadoAcademico;

@Repository("repositorio_estado_academico")
public interface EstadoAcademicoRepository extends JpaRepository<EEstadoAcademico, Serializable>{
	public abstract EEstadoAcademico findById(long id);
}
