package com.batistaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batistaweb.curse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
