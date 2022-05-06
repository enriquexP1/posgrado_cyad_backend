package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ETipoParticipante;

@Repository("repositorio_tipo_participante")
public interface TipoParticipantesRepository extends JpaRepository <ETipoParticipante , Serializable> {
	public abstract ETipoParticipante findById(long id);
	public abstract ETipoParticipante findByTipo(String tipo);
}
