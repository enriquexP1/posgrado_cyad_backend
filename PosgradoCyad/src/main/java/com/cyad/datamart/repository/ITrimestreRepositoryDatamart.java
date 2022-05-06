package com.cyad.datamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.datamart.entity.ETrimestreDatamart;

@Repository("data_repositorio_trimestres")
public interface ITrimestreRepositoryDatamart extends JpaRepository<ETrimestreDatamart, Integer>{
	public abstract ETrimestreDatamart findById(long id);
}
