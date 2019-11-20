package com.dynamis.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.dynamis.models.entity.Comida;
import com.dynamis.models.entity.Ejercicio;

import com.dynamis.models.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {


public Usuario findByUsername(String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario findByUsername2(String username);
	
	
	
	@Query("from Comida")
	public List<Comida> findAllComidas();

	@Query("from Ejercicio")
	public List<Ejercicio> findAllEjercicios();
	
	
	@Query(value = "SELECT u.nombre FROM Usuarios u ",  countQuery = "SELECT count(*) FROM Usuarios",nativeQuery = true)
	public List<Usuario[]> obtenerFechasArray();
	
}
