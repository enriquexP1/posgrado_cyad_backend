package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ECorreo;

@Repository("repositorio_correos")
public interface CorreoRepository extends JpaRepository<ECorreo, Serializable>{
	public abstract ECorreo findById(long id);
	public abstract List<ECorreo> findByTipo(String tipo);
	public abstract ECorreo findByCorreoAndTipo(String correo, String tipo);
}
