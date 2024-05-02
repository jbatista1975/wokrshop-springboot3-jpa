package com.batistaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batistaweb.curse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
