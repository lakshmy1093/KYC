package com.techsquad.ekyc.Repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.techsquad.ekyc.Models.User;

public interface UserRepository extends MongoRepository<User, String> {

	//List<User> getAllUsers();

	//User getUserById(String userId);

	//User addNewUser(User user);

}
