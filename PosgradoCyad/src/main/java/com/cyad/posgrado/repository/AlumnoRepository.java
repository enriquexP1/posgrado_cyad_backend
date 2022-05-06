package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAlumno;

@Repository("repositorio_alumnos")
public interface AlumnoRepository  extends JpaRepository<EAlumno, Serializable> {
	public abstract EAlumno findById(long id);
	public abstract EAlumno findByMatricula(long matricula);
	public abstract List<EAlumno> findByNombre(String nombre);
}
