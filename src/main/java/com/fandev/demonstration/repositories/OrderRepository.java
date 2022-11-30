package com.fandev.demonstration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fandev.demonstration.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
