package com.batistaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batistaweb.curse.entities.OrderItem;
import com.batistaweb.curse.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK> {

}
