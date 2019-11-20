package com.dynamis.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dynamis.models.entity.Ejercicio;

public interface IEjercicioDao extends CrudRepository<Ejercicio, Long>{

	@Query("select p from Ejercicio p where p.nombre like %?1%")
	public List<Ejercicio> findByNombre(String term);
	
	public List<Ejercicio> findByNombreContainingIgnoreCase(String term);
	
	public List<Ejercicio> findByNombreStartingWithIgnoreCase(String term);
}