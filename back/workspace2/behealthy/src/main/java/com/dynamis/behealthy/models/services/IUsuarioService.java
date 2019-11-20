package com.dynamis.behealthy.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.dynamis.behealthy.models.entity.Alimento;
import com.dynamis.behealthy.models.entity.Comida;
import com.dynamis.behealthy.models.entity.Ejercicio;
import com.dynamis.behealthy.models.entity.PlanComida;
import com.dynamis.behealthy.models.entity.PlanEjercicio;
import com.dynamis.behealthy.models.entity.Role;
import com.dynamis.behealthy.models.entity.Usuario;

public interface IUsuarioService {

	
	public Usuario findByUsername(String username);
	
	
	
	public List<Usuario> findAll();
	
	public Page<Usuario> findAll(Pageable pageable);
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	
	public PlanEjercicio findPlanEjercicioById(Long id);
	
	public PlanEjercicio savePlanEjercicio(PlanEjercicio planejercicio);
	
	public void deletePlanEjercicioById(Long id);
	
	public List<Ejercicio> findEjercicioByNombre(String term);
	
	public PlanComida findPlanComidaById(Long id);
	
	public PlanComida savePlanComida(PlanComida plancomida);
	
	public void deletePlanComidaById(Long id);
	
	public List<Alimento> findAlimentoByNombre(String term);
	
	public List<Comida> findAllComidas();
	
	public List<Ejercicio> findAllEjercicios();
	
	public Role findRoleById(Long id);
	
	public List<Usuario[]> obtenerFechasArray();

}
