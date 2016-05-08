package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.domain.User;
import com.sample.repo.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;
	
	@Autowired
	private void setUserRepo(UserRepository userRepo){
		this.userRepo = userRepo;
	}

	public void saveUser(User user){
		userRepo.save(user);
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User findUser(int id){
		return userRepo.find(id);
	}
	
	public void updateUser(int id, User user){
		userRepo.update(id, user);
	}
	
	public void deleteUser(int id){
		userRepo.delete(id);
	}
}
