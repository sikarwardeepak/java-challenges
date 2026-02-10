package com.java.challenges.functional.p072_reducetomax;

import java.util.*;

public class Solution {
    public int findMax(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE, Integer::max);
    }
}