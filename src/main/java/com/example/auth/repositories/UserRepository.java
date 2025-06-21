package com.example.auth.repositories;

import com.example.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    <Optional >User findByUsername(String username);
    boolean existsByUsername(String username);
}
