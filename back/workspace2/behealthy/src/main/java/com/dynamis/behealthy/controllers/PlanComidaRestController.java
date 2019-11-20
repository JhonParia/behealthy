package com.dynamis.behealthy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dynamis.behealthy.models.entity.Alimento;
import com.dynamis.behealthy.models.entity.Comida;
import com.dynamis.behealthy.models.entity.PlanComida;

import com.dynamis.behealthy.models.services.IUsuarioService;


@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api")
public class PlanComidaRestController {

	@Autowired
	private IUsuarioService usuarioService;

	
	@GetMapping("/plancomidas/{id}")
	@ResponseStatus(HttpStatus.OK)
	public PlanComida show(@PathVariable Long id) {
		return usuarioService.findPlanComidaById(id);
	}
	
	
	@DeleteMapping("/plancomidas/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.deletePlanComidaById(id);
	}
	
	
	@GetMapping("/plancomidas/filtrar-comidas/{term}")
	@ResponseStatus(HttpStatus.OK)
	public List<Alimento> filtrarComidas(@PathVariable String term){
		return usuarioService.findAlimentoByNombre(term);
	}
	
	
	@PostMapping("/plancomidas")
	@ResponseStatus(HttpStatus.CREATED)
	public PlanComida crear(@RequestBody PlanComida plancomida) {
		return usuarioService.savePlanComida(plancomida);
	}
	
	
	@GetMapping("/plancomidas/comidas")
	public List<Comida> listarComidas(){
		return usuarioService.findAllComidas();
	}
}
