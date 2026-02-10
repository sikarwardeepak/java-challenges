package com.java.challenges.strings.p018_pangram;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isPangram(String s) {
        if (s == null) return false;
        Set<Character> chars = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') chars.add(c);
        }
        return chars.size() == 26;
    }
}