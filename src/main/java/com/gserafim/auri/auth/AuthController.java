package com.gserafim.auri.auth;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registrar(@RequestBody @Valid RegisterRequest request) {
        authService.registrar(request);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/login")
public ResponseEntity<TokenResponse> login(@RequestBody @Valid LoginRequest request) {
    TokenResponse resposta = authService.login(request.email(), request.senha());
    return ResponseEntity.ok(resposta);
 }
}

