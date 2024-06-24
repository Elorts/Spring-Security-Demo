package com.coderscampus.security.demo.repository;

import com.coderscampus.security.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username); // findByUsername <- decodes our User object, that is why has User word in it
}
