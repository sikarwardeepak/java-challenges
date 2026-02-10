package com.java.challenges.functional.p062_reducesum;

import java.util.List;

public class Solution {
    public int sum(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }
}