package com.com.darlansantos.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.com.darlansantos.workshopmongo.domain.User;
import com.com.darlansantos.workshopmongo.dto.UserDTO;
import com.com.darlansantos.workshopmongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<UserDTO> findAll() {
		 List<User> list = userService.findAll();
		 List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
		 return listDto;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public UserDTO findById(@PathVariable String id) {
		User obj = userService.findById(id);
		 return new UserDTO(obj);
	}
}
