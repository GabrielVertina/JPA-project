package com.stanisci.project1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stanisci.project1.entitys.Order;
import com.stanisci.project1.repositories.UserRepository;


@Service
public class OrderService {
    
@Autowired
private UserRepository repository;

public List<Order> findAll(){

    return repository.findAll();
}

public Order findById (Long id){
Optional<Order> obj = repository.findById(id);
return obj.get();
}







}
