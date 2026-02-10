package com.java.challenges.collections.p058_ransomnote;

import java.util.*;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : magazine.toCharArray()) count.put(c, count.getOrDefault(c, 0) + 1);
        for (char c : ransomNote.toCharArray()) {
            int remaining = count.getOrDefault(c, 0);
            if (remaining == 0) return false;
            count.put(c, remaining - 1);
        }
        return true;
    }
}