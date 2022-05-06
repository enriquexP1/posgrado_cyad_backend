package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EProyecto;

@Repository("repositorio_proyectos")
public interface ProyectoRepository extends JpaRepository<EProyecto,Serializable> {
	public abstract EProyecto findById(long id);
	public abstract List<EProyecto> findByLgac(String lgac);
}
