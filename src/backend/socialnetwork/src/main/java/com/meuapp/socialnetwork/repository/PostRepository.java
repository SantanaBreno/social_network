package com.meuapp.socialnetwork.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.meuapp.socialnetwork.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
    
}
