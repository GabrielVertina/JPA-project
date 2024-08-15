package com.stanisci.project1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stanisci.project1.entitys.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {
    
}
