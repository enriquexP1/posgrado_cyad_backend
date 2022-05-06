package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EParticipante;

@Repository("repositorio_participantes")
public interface ParticipantesRepository extends JpaRepository <EParticipante,Serializable>{
	public abstract EParticipante findById(long id);
}
