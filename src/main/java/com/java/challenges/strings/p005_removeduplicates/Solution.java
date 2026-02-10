package com.java.challenges.strings.p005_removeduplicates;

import java.util.LinkedHashSet;

public class Solution {
    public String removeDuplicates(String s) {
        if (s == null) return null;
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        for (char c : s.toCharArray()) seen.add(c);
        StringBuilder sb = new StringBuilder();
        for (char c : seen) sb.append(c);
        return sb.toString();
    }
}