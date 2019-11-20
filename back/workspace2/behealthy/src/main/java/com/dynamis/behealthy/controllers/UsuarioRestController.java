package com.dynamis.behealthy.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import com.dynamis.behealthy.models.entity.Role;
import com.dynamis.behealthy.models.entity.Usuario;

import com.dynamis.behealthy.models.services.IUploadFileService;
import com.dynamis.behealthy.models.services.IUsuarioService;




@CrossOrigin(origins= {"*"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IUploadFileService uploadService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	
	@Secured({"ROLE_ADMIN"})
	@GetMapping("/usuarios")
	public List<Usuario> index(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuarios/page/{page}")
	public Page<Usuario> index(@PathVariable Integer page) {
		Pageable pageable = PageRequest.of(page, 4);
		return usuarioService.findAll(pageable);
	}
	
//	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@GetMapping("/usuarios/{username}")
	public ResponseEntity <?> show(@PathVariable String username) {
		
		Usuario usuario=null;
		Map<String, Object> response = new HashMap<>();
		try {
		 usuario= usuarioService.findByUsername(username);
		}
		catch(DataAccessException e) {
			response.put("mensaje","Error al realizar la consulta en la base de datos");
			response.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Usuario>(usuario, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		if(usuario == null) {
			response.put("mensaje","El usuario ".concat(username.concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
	
	
	@PostMapping("/usuarios")	
	public ResponseEntity<?> create(@Valid @RequestBody Usuario usuario, BindingResult result) {
		
		Usuario usuarioNew = null;
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {
			/*List<String> errors =new ArrayList<>();
			
			for(FieldError err: result.getFieldErrors()) {
				errors.add("El campo "+ err.getField()err.getDefaultMessage());
			}*/
			
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '"+ err.getField()+ "' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.BAD_REQUEST);
		}
			
	
		try {
			Long roleId =  (long) 1; 
			Role role = (Role) usuarioService.findRoleById(roleId);
			List<Role> roles= new ArrayList<>();
			roles.add(role);

			usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
			usuario.setCreateAt(Calendar.getInstance().getTime());
			usuario.setEnabled(true);
			usuario.setRoles(roles);
			 usuarioNew= usuarioService.save(usuario);
		}catch(DataAccessException e) {
			response.put("mensaje","Error al realizar insert en la base de datos");
			response.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		response.put("mensaje", "El usuario ha sido creado con éxito");
		response.put("usuario", usuarioNew);
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
		
	}
	
	@Secured({"ROLE_ADMIN","ROLE_USER"})
	@PutMapping("/usuarios/{username}")
	public ResponseEntity<?> update(@Valid @RequestBody Usuario usuario, BindingResult result, @PathVariable String username) {
		
		Usuario usuarioActual = usuarioService.findByUsername(username);
		Usuario usuarioUpdated = null;
		
		Map<String, Object> response = new HashMap<>();
		
		if(result.hasErrors()) {
						
			List<String> errors = result.getFieldErrors()
					.stream()
					.map(err -> "El campo '"+ err.getField()+ "' "+ err.getDefaultMessage())
					.collect(Collectors.toList());
			
			
			response.put("errors", errors);
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.BAD_REQUEST);
		}
		
		if(usuarioActual == null) {
			response.put("mensaje","Error: no se puede editar, el usuario ID: ".concat(username.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		
		try {
		usuarioActual.setApellido(usuario.getApellido());
		usuarioActual.setNombre(usuario.getNombre());
		usuarioActual.setEmail(usuario.getEmail());
		
		usuarioUpdated = usuarioService.save(usuarioActual);
		}
		catch(DataAccessException e) {
			response.put("mensaje","Error al actualizar el usuario en la base de datos");
			response.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
		response.put("mensaje", "El usuario ha sido actualizado con éxito");
		response.put("usuario", usuarioUpdated);
		
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
	}
	
	@Secured({"ROLE_ADMIN"})
	@DeleteMapping("/usuarios/{id}")
	
	public ResponseEntity<?> delete(@Valid @RequestBody Usuario usuario, BindingResult result,@PathVariable Long id) {
		
		Usuario usuarioActual = usuarioService.findById(id);
		
		Map<String, Object> response = new HashMap<>();
		
		try {
			
			usuarioActual.setEnabled(false);
			
			
			
		}
		
		catch(DataAccessException e) {
			response.put("mensaje","Error al eliminar el usuario en la base de datos");
			response.put("error",e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);					
		}
		
		response.put("mensaje", "El usuario ha sido eliminado con éxito");
				
		return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
		
	}
	
	@PostMapping("/usuarios/upload")
	public ResponseEntity<?> upload(@RequestParam("archivo") MultipartFile archivo, @RequestParam("id") Long id){
		
		Map<String, Object> response = new HashMap<>();
		
		Usuario usuario = usuarioService.findById(id);
		
		if(!archivo.isEmpty()) {
			String nombreArchivo = null;
			
			
			try{
				nombreArchivo = uploadService.copiar(archivo);
			} catch(IOException e) {
				
				response.put("mensaje","Error al subir la imagen en la base de datos");
				response.put("error",e.getMessage().concat(": ").concat(e.getCause().getMessage()));
				return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
			}
			
			String nombreFotoAnterior= usuario.getFoto();
			
			uploadService.eliminar(nombreFotoAnterior);
			
			usuario.setFoto(nombreArchivo);
			
			usuarioService.save(usuario);
			
			response.put("usuario", usuario);
			response.put("mensaje", "Has subido correctamente la imagen: "+ nombreArchivo );
			
			}
		
				return new ResponseEntity<Map<String,Object>>(response, HttpStatus.CREATED);
	}
	
	@GetMapping("/uploads/image/{nombreFoto:.+}")
	public ResponseEntity<Resource> verFoto(@PathVariable String nombreFoto){
		
		Resource recurso = null;		
		
		try {
			recurso =uploadService.cargar(nombreFoto);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	
		HttpHeaders cabecera = new HttpHeaders();
		cabecera.add(HttpHeaders.CONTENT_DISPOSITION, " attachment;filename=\""+ recurso.getFilename()+"\"");
		return new ResponseEntity<Resource>(recurso, cabecera, HttpStatus.OK);
	}
	
	@GetMapping("/fechas-usuarios")
	public List<Usuario[]> obtenerFechas(){
		return usuarioService.obtenerFechasArray();
	}

}
