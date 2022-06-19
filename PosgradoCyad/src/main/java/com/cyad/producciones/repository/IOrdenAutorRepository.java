package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EOrdenAutor;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de él orden de los autores para este sistema se contemplan hasta un doceavo.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_orden_autor")
public interface IOrdenAutorRepository extends JpaRepository<EOrdenAutor, Serializable> {
	/**
	 * metodo para realizar una busqueda de orden de autor por id
	 * @param id
	 * @return entidad orden de autor
	 */
	public abstract EOrdenAutor findById(long id);
}
