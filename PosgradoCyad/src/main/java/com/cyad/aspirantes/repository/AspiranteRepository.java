package com.cyad.aspirantes.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.aspirantes.entity.EAspirante;

@Repository("repositorio_aspirantes")
public interface AspiranteRepository extends JpaRepository<EAspirante, Serializable>{
	public abstract EAspirante findById(long id);
}
