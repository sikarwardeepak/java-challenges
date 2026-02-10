package com.java.challenges.strings.p019_characterfrequency;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> map = new HashMap<>();
        if (s == null) return map;
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}