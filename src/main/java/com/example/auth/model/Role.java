package com.example.auth.model;

import jakarta.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ERole name;

    public enum ERole {
        ROLE_USER,
        ROLE_ADMIN
    }

    public ERole getName() {
        return name;
    }
}
