package com.java.challenges.collections.p044_groupbyage;

import java.util.*;

public class Solution {
    public Map<Integer, List<String>> groupByAge(List<String[]> people) {
        Map<Integer, List<String>> groups = new HashMap<>();
        for (String[] person : people) {
            int age = Integer.parseInt(person[1]);
            groups.computeIfAbsent(age, k -> new ArrayList<>()).add(person[0]);
        }
        return groups;
    }
}