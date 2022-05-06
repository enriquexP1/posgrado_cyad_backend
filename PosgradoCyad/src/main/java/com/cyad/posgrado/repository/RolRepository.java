package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ERol;

@Repository("repositorio_rol")
public interface RolRepository extends JpaRepository <ERol , Serializable>{
	public abstract ERol findById(long id);
	public abstract ERol findByRol(String rol);
}
