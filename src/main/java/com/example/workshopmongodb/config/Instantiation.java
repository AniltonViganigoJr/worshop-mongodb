package com.example.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.workshopmongodb.domain.User;
import com.example.workshopmongodb.repositories.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User user1 = new User(null, "User Number #01", "user01@gmail.com");
		User user2 = new User(null, "User Number #02", "user02@gmail.com");
		User user3 = new User(null, "User Number #03", "user03@gmail.com");
		User user4 = new User(null, "User Number #04", "user04@gmail.com");
		User user5 = new User(null, "User Number #05", "user05@gmail.com");
		User user6 = new User(null, "User Number #06", "user06@gmail.com");
		
		userRepository.saveAll(Arrays.asList(user1,user2,user3,user4,user5,user6));
	}
}