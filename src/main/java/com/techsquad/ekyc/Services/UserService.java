package com.techsquad.ekyc.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techsquad.ekyc.Models.User;
import com.techsquad.ekyc.Repos.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}
	
	public User createUser(User user) {
		return userRepo.save(user);
	}

}
