package com.example.auth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private long id;

    @Enumerated(value = jakarta.persistence.EnumType.STRING)
    private ERole role;

    public enum ERole {
        ROLE_USER,
        ROLE_ADMIN
    }
}
