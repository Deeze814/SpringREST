package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.domain.User;
import com.rest.repo.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;
	
	@Autowired
	private void setUserRepo(UserRepository userRepo){
		this.userRepo = userRepo;
	}

	public boolean saveUser(User user){
		return userRepo.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User findUser(int id){
		return userRepo.find(id);
	}
	
	public boolean updateUser(int id, User user){
		return userRepo.update(id, user);
	}
	
	public boolean deleteUser(int id){
		return userRepo.delete(id);
	}
}
