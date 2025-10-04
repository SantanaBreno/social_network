package com.meuapp.socialnetwork.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meuapp.socialnetwork.domain.User;
import com.meuapp.socialnetwork.repository.UserRepository;

@Service    
public class UserService {
    
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
