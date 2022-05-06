package com.cyad.datamart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.datamart.entity.EParticipanteDatamart;

@Repository("data_repositorio_participantes")
public interface IParticipanteRepositoryDatamart extends JpaRepository<EParticipanteDatamart, Integer>{
	public abstract EParticipanteDatamart findById(long id); 
}
