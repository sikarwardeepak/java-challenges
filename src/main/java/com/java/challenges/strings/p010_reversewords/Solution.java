package com.java.challenges.strings.p010_reversewords;

public class Solution {
    public String reverseWords(String s) {
        if (s == null) return null;
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }
}