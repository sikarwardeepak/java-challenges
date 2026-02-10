package com.java.challenges.strings.p002_palindromecheck;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}