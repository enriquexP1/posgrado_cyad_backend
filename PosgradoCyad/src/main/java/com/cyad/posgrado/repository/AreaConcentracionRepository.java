package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAreaConcentracion;

@Repository("repositorio_area_concentracion")
public interface AreaConcentracionRepository extends JpaRepository<EAreaConcentracion, Serializable> {
	
	public abstract EAreaConcentracion findById(long id);

}
