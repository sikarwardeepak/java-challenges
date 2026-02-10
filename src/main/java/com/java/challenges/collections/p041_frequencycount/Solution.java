package com.java.challenges.collections.p041_frequencycount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public Map<String, Integer> countFrequency(List<String> items) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        if (items == null)
            return frequencyMap;

        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }
        return frequencyMap;
    }
}
