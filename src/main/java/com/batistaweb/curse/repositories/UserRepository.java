package com.batistaweb.curse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batistaweb.curse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
