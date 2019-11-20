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

import com.dynamis.behealthy.models.entity.Ejercicio;
import com.dynamis.behealthy.models.entity.PlanEjercicio;
import com.dynamis.behealthy.models.services.IUsuarioService;


	@CrossOrigin(origins = { "*" })
	@RestController
	@RequestMapping("/api")
	public class PlanEjercicioRestController {

		@Autowired
		private IUsuarioService usuarioService;

		//@Secured({"ROLE_ADMIN", "ROLE_USER"})
		@GetMapping("/planejercicios/{id}")
		@ResponseStatus(HttpStatus.OK)
		public PlanEjercicio show(@PathVariable Long id) {
			return usuarioService.findPlanEjercicioById(id);
		}
		
		//@Secured({"ROLE_ADMIN", "ROLE_USER"})
		@DeleteMapping("/planejercicios/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			usuarioService.deletePlanEjercicioById(id);
		}
		
		//@Secured({"ROLE_ADMIN", "ROLE_USER"})
		@GetMapping("/planejercicios/filtrar-ejercicios/{term}")
		@ResponseStatus(HttpStatus.OK)
		public List<Ejercicio> filtrarEjercicios(@PathVariable String term){
			return usuarioService.findEjercicioByNombre(term);
		}
		
		//@Secured({"ROLE_ADMIN", "ROLE_USER"})
		@PostMapping("/planejercicios")
		@ResponseStatus(HttpStatus.CREATED)
		public PlanEjercicio crear(@RequestBody PlanEjercicio planejercicio) {
			return usuarioService.savePlanEjercicio(planejercicio);
		}
		
		
		@GetMapping("/ejercicios")
		public List<Ejercicio> listarEjercicios(){
			return usuarioService.findAllEjercicios();
		}
	}

