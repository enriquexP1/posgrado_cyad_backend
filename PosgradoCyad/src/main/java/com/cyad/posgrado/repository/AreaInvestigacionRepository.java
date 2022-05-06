package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAreaInvestigacion;

@Repository("repositorio_areas")
public interface AreaInvestigacionRepository extends JpaRepository<EAreaInvestigacion, Serializable>{
	public abstract EAreaInvestigacion findById(long id);
}
