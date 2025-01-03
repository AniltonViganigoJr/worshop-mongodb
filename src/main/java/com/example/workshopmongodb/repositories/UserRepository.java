package com.example.workshopmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}