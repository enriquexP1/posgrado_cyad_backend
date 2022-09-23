package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EMemoria;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de los autores de
 * producciones.
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_memoria")
public interface MemoriaRepository extends JpaRepository<EMemoria, Serializable> {
	/**
	 * metodo para realizar una busqueda de memoria por id
	 * 
	 * @param id
	 * @return entidad memoria
	 */
	public abstract EMemoria findById(long id);
}
