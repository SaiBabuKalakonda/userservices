package com.htc.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.htc.user.entity.User;
import com.htc.user.persistence.IUser;



@RestController
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	private IUser userRepository;
 
@GetMapping("/user/{name}")
User getUser(@PathVariable String name)
{
	User doc=null;
	doc=userRepository.findById(name).get();
	return doc;
	
}


@GetMapping("/users")
public List<User> getAllUsers() {
 
  List<User> list = new ArrayList<>();
  Iterable<User> customers = userRepository.findAll();

  customers.forEach(list::add);
  return list;
	
}

@PostMapping("/users")
User createEmployee(@RequestBody User user)

{
	
	return userRepository.save(user);
	
}

@PutMapping("/user")
private User update(@RequestBody User user)   
{  
user=userRepository.saveAndFlush(user);  
return user;  
}  

@DeleteMapping("/user/{userId}")
void deletePatient(@PathVariable String name)
{
	userRepository.deleteById(name);
	
}



	
}