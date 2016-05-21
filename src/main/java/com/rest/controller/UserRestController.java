package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.domain.User;
import com.rest.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public  ResponseEntity<Boolean> save(@RequestBody User user){
		return userService.saveUser(user) 
			? new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK)
			: new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public List<User> list(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET)
	public User get(@PathVariable("id") int id){
		return userService.findUser(id);
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Boolean> update(@PathVariable("id") int id, @RequestBody User user){
		return userService.updateUser(id, user)
			? new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK)
			: new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id){
		return userService.deleteUser(id)
			? new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK)
			: new ResponseEntity<Boolean>(Boolean.FALSE, HttpStatus.BAD_REQUEST);
	}
}
