package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.ETipoClave;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de los tipos de clave con los que puede contar un autor, dado que existen diferentes plataformas donde se publican los artículos.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_tipo_clave")
public interface ITipoClaveRepository extends JpaRepository<ETipoClave, Serializable>  {
	/**
	 * metodo para realizar una busqueda de un tipo de clave por id
	 * @param id
	 * @return entidad tipo de clave
	 */
	public abstract ETipoClave findById(long id);
}
