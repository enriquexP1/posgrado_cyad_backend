package com.cyad.datamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.datamart.entity.ETrayectoriaDatamart;

@Repository("data_repositorio_trayectorias")
public interface ITrayectoriaRepositoryDatamart extends JpaRepository<ETrayectoriaDatamart, Integer>{
	public abstract ETrayectoriaDatamart findById(long id);
}
