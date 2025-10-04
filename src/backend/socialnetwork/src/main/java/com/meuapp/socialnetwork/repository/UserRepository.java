package com.meuapp.socialnetwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.meuapp.socialnetwork.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
}
