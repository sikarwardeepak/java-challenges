package com.java.challenges.arrays.p040_pairsumtarget;

import java.util.*;

public class Solution {
    public List<int[]> findPairs(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.getOrDefault(complement, 0) > 0) {
                result.add(new int[]{complement, num});
                map.put(complement, map.get(complement) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return result;
    }
}