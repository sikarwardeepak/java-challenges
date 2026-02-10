package com.java.challenges.collections.p048_sortmapbyvalue;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public Map<String, Integer> sortByValue(Map<String, Integer> map) {
        return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}