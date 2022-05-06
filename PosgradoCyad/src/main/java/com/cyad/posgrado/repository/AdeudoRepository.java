package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAdeudo;

@Repository("repositorio_adeudos")
public interface AdeudoRepository extends JpaRepository<EAdeudo, Serializable> {
	public abstract EAdeudo findById(long id);
}
