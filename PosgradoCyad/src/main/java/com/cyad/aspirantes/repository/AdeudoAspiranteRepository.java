package com.cyad.aspirantes.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.aspirantes.entity.EAdeudoAspirante;

@Repository("repositorio_adeudos_aspirantes")
public interface AdeudoAspiranteRepository extends JpaRepository<EAdeudoAspirante, Serializable>{
	public abstract EAdeudoAspirante findById(long id);
}
