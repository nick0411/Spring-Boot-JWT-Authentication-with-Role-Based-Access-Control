package com.example.auth.repositories;

import com.example.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    <Optional> Role findByRole(Role.ERole role);
}
