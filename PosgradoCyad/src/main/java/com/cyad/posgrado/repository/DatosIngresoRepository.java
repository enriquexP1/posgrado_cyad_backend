package com.cyad.posgrado.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EDatosIngreso;

@Repository("repositorio_datos_ingreso")
public interface DatosIngresoRepository extends JpaRepository<EDatosIngreso, Serializable>  {
	public abstract EDatosIngreso findById(long id);
}
