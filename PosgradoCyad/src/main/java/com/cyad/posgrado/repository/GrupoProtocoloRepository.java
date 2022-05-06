package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EGrupoProtocolo;

@Repository("repositorio_grupo_protocolo")
public interface GrupoProtocoloRepository extends JpaRepository<EGrupoProtocolo,Serializable>{
	public abstract EGrupoProtocolo findById(long id);
	public abstract EGrupoProtocolo findByClave(String clave);
}
