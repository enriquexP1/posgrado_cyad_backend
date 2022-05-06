package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAlumno;
import com.cyad.posgrado.entity.EDireccion;

@Repository("repositorio_direcciones")
public interface DireccionRepository extends JpaRepository<EDireccion, Serializable>{
	public abstract EDireccion findById(long id);
	public abstract EDireccion findByCalleAndNumero(String calle, int numero);
	public abstract EDireccion findByAlumno(EAlumno alumno);
	public abstract List<EAlumno> findByCp(int cp);
}
