package com.cyad.datamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.datamart.entity.EDatosPorTrimestreDatamart;

@Repository("data_repositorio_datos")
public interface IDatosPorTrimestreRepositoryDatamart extends JpaRepository<EDatosPorTrimestreDatamart, Integer>{
	public abstract EDatosPorTrimestreDatamart findById(long id);
}
