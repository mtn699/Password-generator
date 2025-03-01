package com.example.passwordGeneratorApp.service;
import org.springframework.stereotype.Service;
import java.security.SecureRandom;

@Service

public class PasswordService {
    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+[]{};:,.<>?/";

    public String generatePassword(int length, boolean includeAlphabets, boolean includeNumbers, boolean includeSpecialChars) {
        StringBuilder characterPool = new StringBuilder();
        SecureRandom random = new SecureRandom();

        if (includeAlphabets) characterPool.append(ALPHABETS);
        if (includeNumbers) characterPool.append(NUMBERS);
        if (includeSpecialChars) characterPool.append(SPECIAL_CHARACTERS);

        if (characterPool.length() == 0) {
            characterPool.append(ALPHABETS); // Default to alphabets if no option is selected
        }

        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(randomIndex));
        }

        return password.toString();
    }
}


