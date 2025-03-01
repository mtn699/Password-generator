package com.example.passwordGeneratorApp.model;

public class PasswordRequest {
    private int length;
    private boolean includeAlphabets;
    private boolean includeNumbers;
    private boolean includeSpecialChars;

    // Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public boolean isIncludeAlphabets() {
        return includeAlphabets;
    }

    public void setIncludeAlphabets(boolean includeAlphabets) {
        this.includeAlphabets = includeAlphabets;
    }

    public boolean isIncludeNumbers() {
        return includeNumbers;
    }

    public void setIncludeNumbers(boolean includeNumbers) {
        this.includeNumbers = includeNumbers;
    }
    public boolean isIncludeSpecialChars() {
        return includeSpecialChars;
    }

    public void setIncludeSpecialChars(boolean includeSpecialChars) {
        this.includeSpecialChars = includeSpecialChars;
    }
}
