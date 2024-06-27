package com.stanisci.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stanisci.project1.entitys.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
} 

