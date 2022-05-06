package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EDepartamento;

@Repository("repositorio_departamentos")
public interface DepartamentoRepository extends JpaRepository<EDepartamento, Serializable>{
	public abstract EDepartamento findById(long id);
	public abstract EDepartamento findByDepartamento(String departamento);
}
