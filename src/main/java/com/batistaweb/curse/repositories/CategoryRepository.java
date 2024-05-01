package com.batistaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batistaweb.curse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
