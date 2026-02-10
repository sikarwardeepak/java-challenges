package com.java.challenges.collections.p056_subdomainvisitcount;

import java.util.*;

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> counts = new HashMap<>();
        for (String cpd : cpdomains) {
            String[] parts = cpd.split(" ");
            int count = Integer.parseInt(parts[0]);
            String domain = parts[1];
            String[] frags = domain.split("\\.");
            String cur = "";
            for (int i = frags.length - 1; i >= 0; i--) {
                cur = frags[i] + (cur.isEmpty() ? "" : "." + cur);
                counts.put(cur, counts.getOrDefault(cur, 0) + count);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            result.add(e.getValue() + " " + e.getKey());
        }
        return result;
    }
}