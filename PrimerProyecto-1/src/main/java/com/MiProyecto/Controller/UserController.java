package com.MiProyecto.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MiProyecto.models.User;
import com.MiProyecto.repository.UserDAO;

@RestController
public class UserController {
	
	@Autowired
	private UserDAO userDao;
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "hola mundo";
	}
	
	public List<String> mostrar(){
		return List.of("Tomas","Matias","Luis");
	}

	@RequestMapping(value="listuser")
	public List<User> listarVariosUsuarios() {
		
		List<User> usuarios = new ArrayList<>();
		User usuario1 = new User();
		usuario1.setId(1L);
		usuario1.setNombre("Tomas");
		usuario1.setApellido("Fantinel");
		usuario1.setEmail("tomasfantinel@gmail.com");
		usuario1.setTelefono("2611092756");
		usuario1.setPassword("2003");
		User usuario2 = new User();
		usuario2.setId(2L);
		usuario2.setNombre("Matias");
		usuario2.setApellido("Buenaventura");
		usuario2.setEmail("matibuenaAventura@gmail.com");
		usuario2.setTelefono("2611053756");
		usuario2.setPassword("1234");
		User usuario3 = new User();
		usuario3.setId(3L);
		usuario3.setNombre("Luis");
		usuario3.setApellido("Fantinel");
		usuario3.setEmail("elbuenlui@gmail.com");
		usuario3.setTelefono("2611053576");
		usuario3.setPassword("luisito");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		return usuarios;
	}
	@RequestMapping(value="api/users")
	public List<User> getUser(){
		List<User> user= userDao.getUser();
		return user;
	}
}
