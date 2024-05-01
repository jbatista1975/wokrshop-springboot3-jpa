package com.batistaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batistaweb.curse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
