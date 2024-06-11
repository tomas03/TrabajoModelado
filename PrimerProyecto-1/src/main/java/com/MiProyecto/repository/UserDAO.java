package com.MiProyecto.repository;

import java.util.List;

import com.MiProyecto.models.User;

import jakarta.transaction.Transactional;

@Transactional
public interface UserDAO {
	List<User> getUser();
}
