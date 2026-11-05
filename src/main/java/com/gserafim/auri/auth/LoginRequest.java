package com.gserafim.auri.auth;

public record LoginRequest(
    String email,
    String senha
) {}