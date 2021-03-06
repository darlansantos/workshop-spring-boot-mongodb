package com.com.darlansantos.workshopmongo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.com.darlansantos.workshopmongo.domain.User;
import com.com.darlansantos.workshopmongo.repositories.UserRepository;
import com.com.darlansantos.workshopmongo.services.UserService;
import com.com.darlansantos.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User findById(String id) {
		return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
