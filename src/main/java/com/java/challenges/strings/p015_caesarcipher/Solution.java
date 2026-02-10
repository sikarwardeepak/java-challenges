package com.java.challenges.strings.p015_caesarcipher;

public class Solution {
    public String encrypt(String text, int shift) {
        if (text == null) return null;
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                sb.append((char) ((c - base + shift % 26 + 26) % 26 + base));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}