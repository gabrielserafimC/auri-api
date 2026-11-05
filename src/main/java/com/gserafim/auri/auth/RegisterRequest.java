package com.gserafim.auri.auth;

public record RegisterRequest(
    String nome,
    String email,
    String senha
) {}