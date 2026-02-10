package com.java.challenges.strings.p004_countvowels;

public class Solution {
    public int countVowels(String s) {
        if (s == null) return 0;
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }
}