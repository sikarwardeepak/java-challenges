package com.java.challenges.strings.p008_firstnonrepeating;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.isEmpty()) return -1;
        Map<Character, Integer> count = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}