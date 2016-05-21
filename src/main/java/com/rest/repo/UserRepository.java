package com.rest.repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.rest.domain.User;

@Repository
public class UserRepository {

	private Map<Integer,User> users = new HashMap<Integer,User>();
	
	@PostConstruct
	public void setup(){
		users.put(1, new User(1,"Dennis","Ezell"));
		users.put(2, new User(2,"Victor","Schutz"));
	}
	
	public boolean save(User user){
		users.put(user.getUserID(), user);
		return users.containsKey(user.getUserID());
	}
	
	public List<User> findAll(){
		return new ArrayList<User>(users.values());
	}
	
	public User find(int id){
		return users.get(id);
	}
	
	public boolean update(int id, User user){
		return users.replace(id, users.get(id), user);
		
	}
	
	public boolean delete(int id){		
		return users.remove(id,users.get(id));
	}
}
