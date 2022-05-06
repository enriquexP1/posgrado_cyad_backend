package com.cyad.datamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.datamart.entity.EAlumnoDatamart;

@Repository("data_repositorio_alumnos")
public interface IAlumnoRepositoryDatamart extends JpaRepository<EAlumnoDatamart, Integer> {
	public abstract EAlumnoDatamart findById(long id);
}
