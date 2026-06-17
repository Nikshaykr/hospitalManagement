package com.learningspringboot.hospitalManagement.controller;

import com.learningspringboot.hospitalManagement.dto.LoginRequestDto;
import com.learningspringboot.hospitalManagement.dto.LoginResponseDto;
import com.learningspringboot.hospitalManagement.dto.SignupRequestDto;
import com.learningspringboot.hospitalManagement.dto.SignupResponseDto;
import com.learningspringboot.hospitalManagement.security.AuthService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) {
        return ResponseEntity.ok(authService.login(loginRequestDto));
    }

    @PostMapping("/signup")
    public ResponseEntity<SignupResponseDto> signup(@RequestBody SignupRequestDto signupRequestDto) {
        return ResponseEntity.ok(authService.signup(signupRequestDto));
    }
}
