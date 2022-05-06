package com.cyad.aspirantes.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.aspirantes.entity.EEstadoAspirante;

@Repository("repositorio_estados_aspirantes")
public interface EstadoAspiranteRepository extends JpaRepository<EEstadoAspirante, Serializable>{
	public abstract EEstadoAspirante findById(long id);
}
