package com.java.challenges.collections.p060_uncommonwords;

import java.util.*;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> count = new HashMap<>();
        for (String w : (s1 + " " + s2).split(" ")) count.put(w, count.getOrDefault(w, 0) + 1);
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> e : count.entrySet()) {
            if (e.getValue() == 1) result.add(e.getKey());
        }
        return result.toArray(new String[0]);
    }
}