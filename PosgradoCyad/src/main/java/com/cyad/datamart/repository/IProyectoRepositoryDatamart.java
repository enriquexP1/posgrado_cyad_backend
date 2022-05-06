package com.cyad.datamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.datamart.entity.EProyectoDatamart;

@Repository("data_repositorio_proyectos")
public interface IProyectoRepositoryDatamart extends JpaRepository<EProyectoDatamart, Integer>{
	public abstract EProyectoDatamart findById(long id);
}
