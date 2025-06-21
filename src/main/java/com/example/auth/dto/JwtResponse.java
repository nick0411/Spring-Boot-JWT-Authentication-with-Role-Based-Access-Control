package com.example.auth.dto;

import java.util.List;

public record JwtResponse (String token, String username, List<String> roles) {}
