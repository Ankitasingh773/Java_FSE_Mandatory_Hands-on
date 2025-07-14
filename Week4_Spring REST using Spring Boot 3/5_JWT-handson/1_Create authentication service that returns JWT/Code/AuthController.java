package com.example.jwt.auth.controller;
import com.example.jwt.auth.model.AuthResponse;
import com.example.jwt.auth.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping("/authenticate")
    public ResponseEntity<AuthResponse> authenticate(HttpServletRequest request) {
        
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
            String decoded = new String(decodedBytes, StandardCharsets.UTF_8);

            String[] parts = decoded.split(":", 2);
            String username = parts[0];
            String password = parts[1];

            if (username.equals("user") && password.equals("pwd")) {
               
                String token = jwtUtil.generateToken(username);
                return ResponseEntity.ok(new AuthResponse(token));
            }
        }

        return ResponseEntity.status(401).build();
    }
}
