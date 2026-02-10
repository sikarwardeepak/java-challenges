package com.java.challenges.functional.p071_partitionby;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }
}