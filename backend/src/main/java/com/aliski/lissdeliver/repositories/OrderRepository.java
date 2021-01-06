package com.aliski.lissdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliski.lissdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
