package com.dynamis.behealthy.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dynamis.behealthy.models.dao.IEjercicioDao;
import com.dynamis.behealthy.models.dao.IPlanComidaDao;
import com.dynamis.behealthy.models.dao.IPlanEjercicioDao;
import com.dynamis.behealthy.models.dao.IRoleDao;
import com.dynamis.behealthy.models.dao.IUsuarioDao;
import com.dynamis.behealthy.models.entity.Alimento;
import com.dynamis.behealthy.models.entity.Comida;
import com.dynamis.behealthy.models.entity.Ejercicio;
import com.dynamis.behealthy.models.entity.PlanComida;
import com.dynamis.behealthy.models.entity.PlanEjercicio;
import com.dynamis.behealthy.models.entity.Role;
import com.dynamis.behealthy.models.entity.Usuario;
import com.dynamis.behealthy.models.dao.IAlimentoDao;


@Service
public class UsuarioService implements  IUsuarioService, UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	private IPlanEjercicioDao planejercicioDao;
	
	@Autowired
	private IEjercicioDao ejercicioDao;
	
	@Autowired
	private IAlimentoDao alimentoDao;
	
	
	@Autowired
	private IPlanComidaDao plancomidaDao;
	
	@Autowired
	private IRoleDao roleDao;
	
	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if(usuario == null) {
			logger.error("Error en el login: no existe el usuario '"+username+"'en el sistema");
			throw new UsernameNotFoundException("Error en el login: no existe el usuario '"+username+"'en el sistema");
		}
		
		List<GrantedAuthority> authorities = usuario.getRoles().
				stream().
				map(role ->new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role: "+ authority.getAuthority()))
				.collect(Collectors.toList());
		
		return new User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities);
	}
	
	@Override
	@Transactional(readOnly=true)
	public Usuario findByUsername(String username) {
		
		return usuarioDao.findByUsername(username);
	}

	@Override
	@Transactional(readOnly=true)
	public PlanEjercicio findPlanEjercicioById(Long id) {
		return planejercicioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public PlanEjercicio savePlanEjercicio(PlanEjercicio planejercicio) {
		
		return planejercicioDao.save(planejercicio);
	}

	@Override
	@Transactional
	public void deletePlanEjercicioById(Long id) {
		planejercicioDao.deleteById(id);
		
	}

	@Override
	@Transactional
	public List<Ejercicio> findEjercicioByNombre(String term) {
		
		return ejercicioDao.findByNombreContainingIgnoreCase(term);
	}

	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public Page<Usuario> findAll(Pageable pageable) {
		return usuarioDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioDao.save(usuario);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		 usuarioDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly=true)
	public PlanComida findPlanComidaById(Long id) {
		// TODO Auto-generated method stub
		return plancomidaDao.findById(id).orElse(null);
	}

	@Override
	public PlanComida savePlanComida(PlanComida plancomida) {
		// TODO Auto-generated method stub
		return plancomidaDao.save(plancomida);
	}

	@Override
	public void deletePlanComidaById(Long id) {
		// TODO Auto-generated method stub
		plancomidaDao.deleteById(id);
	}

	@Override
	public List<Alimento> findAlimentoByNombre(String term) {
		// TODO Auto-generated method stub
		return alimentoDao.findByNombreContainingIgnoreCase(term);
	}

	@Override
	public List<Comida> findAllComidas() {
		// TODO Auto-generated method stub
		return usuarioDao.findAllComidas();
	}

	@Override
	public List<Ejercicio> findAllEjercicios() {
		
		return usuarioDao.findAllEjercicios();
	}

	@Override
	@Transactional(readOnly=true)
	public Role findRoleById(Long id) {
		
		return roleDao.findById(id).orElse(null);
	}

	@Override
	public List<Usuario[]> obtenerFechasArray() {
		// TODO Auto-generated method stub
		return usuarioDao.obtenerFechasArray();
	}
}
