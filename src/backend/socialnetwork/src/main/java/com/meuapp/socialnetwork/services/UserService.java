package com.meuapp.socialnetwork.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.meuapp.socialnetwork.domain.User;
import com.meuapp.socialnetwork.dto.UserDTO;
import com.meuapp.socialnetwork.repository.UserRepository;
import com.meuapp.socialnetwork.services.exception.ObjectNotFoundException;

@Service    
public class UserService {
    
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        return repo.findById(id)
            .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);;
    }

    public User update(User obj) {
        User newObj = repo.findById(obj.getId())
            .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
        UpdateData(newObj, obj);
        return repo.save(newObj);
    }

    private void UpdateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }
    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
