package com.java.challenges.strings.p016_titlecase;

public class Solution {
    public String toTitleCase(String s) {
        if (s == null || s.isEmpty()) return s;
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i].substring(1).toLowerCase());
            }
            if (i < words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}