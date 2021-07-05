package com.com.darlansantos.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.com.darlansantos.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

}
