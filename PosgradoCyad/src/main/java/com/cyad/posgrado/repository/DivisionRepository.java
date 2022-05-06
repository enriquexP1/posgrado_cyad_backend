package com.cyad.posgrado.repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EDivision;

@Repository("repositorio_divisiones")
public interface DivisionRepository extends JpaRepository<EDivision, Serializable>{
	public abstract EDivision findById(long id);
	public abstract EDivision findByDivision(String division);
}
