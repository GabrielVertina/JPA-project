package com.stanisci.project1.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stanisci.project1.entitys.User;
import com.stanisci.project1.repositories.UserRepository;
@Service
public class UserService {
    
private UserRepository repository;


public List<User> findAll(){
return repository.findAll();

}

public User findById(Long id){
Optional<User> obj = repository.findById(id);
return obj.get();
    
}

}