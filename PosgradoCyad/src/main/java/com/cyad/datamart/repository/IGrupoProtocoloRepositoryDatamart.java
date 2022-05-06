package com.cyad.datamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.datamart.entity.EGrupoProtocoloDatamart;

@Repository("data_repositorio_grupo_protocolo")
public interface IGrupoProtocoloRepositoryDatamart extends JpaRepository<EGrupoProtocoloDatamart, Integer>{
	public abstract EGrupoProtocoloDatamart findById(long id); 
}
