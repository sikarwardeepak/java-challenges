package com.java.challenges.collections.p046_findduplicates;

import java.util.*;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for (int n : nums) {
            if (!seen.add(n)) result.add(n);
        }
        return result;
    }
}