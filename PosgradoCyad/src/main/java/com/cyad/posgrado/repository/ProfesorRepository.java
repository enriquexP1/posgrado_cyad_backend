package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EProfesor;

@Repository("repositorio_profesores")
public interface ProfesorRepository extends JpaRepository<EProfesor,Serializable> {
	
	public abstract EProfesor findById(long id);
	
	public abstract EProfesor findByNombreAndId(String nombre, long id);
	
	public abstract List<EProfesor> findByNombre(String nombre);
	
}
