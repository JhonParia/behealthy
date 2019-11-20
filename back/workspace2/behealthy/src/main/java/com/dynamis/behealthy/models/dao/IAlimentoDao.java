package com.dynamis.behealthy.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dynamis.behealthy.models.entity.Alimento;

public interface IAlimentoDao extends CrudRepository<Alimento, Long>{

	@Query("select p from Alimento p where p.nombre like %?1%")
	public List<Alimento> findByNombre(String term);
	
	public List<Alimento> findByNombreContainingIgnoreCase(String term);
	
	public List<Alimento> findByNombreStartingWithIgnoreCase(String term);

}
