package com.example.passwordGeneratorApp.controller;
import com.example.passwordGeneratorApp.model.PasswordRequest;
import com.example.passwordGeneratorApp.service.PasswordService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/password")
@CrossOrigin("*") // Allow frontend to call the backend

public class PasswordController {
    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @PostMapping("/generate")
    public String generatePassword(@RequestBody PasswordRequest request) {
        return passwordService.generatePassword(
                request.getLength(),
                request.isIncludeAlphabets(),
                request.isIncludeNumbers(),
                request.isIncludeSpecialChars()
        );
    }
}


