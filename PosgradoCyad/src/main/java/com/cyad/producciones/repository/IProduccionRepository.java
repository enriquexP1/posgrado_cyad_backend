package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EProduccion;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de las producciones de investigaciones y artículos generados por los alumnos y profesores de los posgrados.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_produccion")
public interface IProduccionRepository extends JpaRepository<EProduccion, Serializable> {
	/**
	 * metodo para realizar una busqueda de una produccion por id
	 * @param id
	 * @return entidad produccion
	 */
	public abstract EProduccion findById(long id);
	
}
