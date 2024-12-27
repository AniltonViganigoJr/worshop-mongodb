package com.example.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshopmongodb.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> users = new ArrayList<>();

		User user1 = new User("1001", "User Number #01", "user_number1@gmail.com");
		User user2 = new User("1002", "User Number #02", "user_number2@gmail.com");
		User user3 = new User("1003", "User Number #03", "user_number3@gmail.com");

		users.addAll(Arrays.asList(user1, user2,user3));
		
		return ResponseEntity.ok().body(users);
	}
}