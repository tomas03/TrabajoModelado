package com.MiProyecto.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.MiProyecto.models.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;



@Repository
@Transactional
public class UserDAOImp implements UserDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<User> getUser() {
		String query ="from User";
		List<User> resultado = entityManager.createQuery(query).getResultList();
		return resultado;
	}
	
}
