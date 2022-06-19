package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccion;
import com.cyad.producciones.model.MProduccion;
/**
 * Esta clase realiza una conversion de una entidad EProduccion a un objeto MProduccion
 * @author Salvador Solis Atenco
 *
 */
@Component("convertidor_producciones")
public class ConvertidorProduccion {
	/**
	 * metodo que convierte una lista de entidades EProduccion en objetos MProduccion
	 * @param lista de entidades EProduccion
	 * @return lista de objetos MProduccion
	 */
	public List<MProduccion> convertirLista(List<EProduccion> eproducciones){
		List<MProduccion> mproducciones = new ArrayList<>();
		for(EProduccion produccion : eproducciones) {
			mproducciones.add(new MProduccion(produccion));
		}
		return mproducciones;
	}
}
