package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;

	public User save(User user) {
		User user1=userRepo.save(user);
		return user1;
		
	}

	public User search(String username) {
		System.out.print("in search username"+username);
		User user1=userRepo.findByName(username);
		return user1;
	}
	

}
