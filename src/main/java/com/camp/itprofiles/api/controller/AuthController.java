package com.camp.itprofiles.api.controller;

import com.camp.itprofiles.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import com.camp.itprofiles.dto.response.AccessResponse;
import com.camp.itprofiles.dto.request.SignUpRequest;
import com.camp.itprofiles.dto.request.LogInRequest;

@Tag(name = "Authentication", description = "API для аутентификации и авторизации")
@RequestMapping("/api/auth")
@RestController
@RequiredArgsConstructor
public class AuthController{

    private final AuthService authService;

    @Operation(summary = "Регистрация нового пользователя")
    @PostMapping("register")
    public ResponseEntity<AccessResponse> signUp(@RequestBody SignUpRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(authService.signUp(request));
    }

    @Operation(summary = "Вход существующего пользователя")
    @GetMapping("login")
    public ResponseEntity<AccessResponse> signIn(@RequestBody LogInRequest request) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(authService.signIn(request));
    }
}
