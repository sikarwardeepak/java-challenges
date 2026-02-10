package com.java.challenges.functional.p068_predicatechaining;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> filterPositiveEven(List<Integer> numbers) {
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        return numbers.stream().filter(isPositive.and(isEven)).collect(Collectors.toList());
    }
}