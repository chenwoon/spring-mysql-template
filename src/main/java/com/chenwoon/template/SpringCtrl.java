package com.chenwoon.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chenwoon.template.entity.User;
import com.chenwoon.template.entity.UserRepository;

@RestController
public class SpringCtrl {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(path="/add")
	public @ResponseBody User addNewUser (@RequestParam String name, @RequestParam String email) {
		User u = new User();
		u.setName(name);
		u.setEmail(email);
		userRepository.save(u);
		return u;
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML 
		return userRepository.findAll();
	}
}
