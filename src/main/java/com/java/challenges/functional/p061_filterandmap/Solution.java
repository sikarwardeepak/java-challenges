package com.java.challenges.functional.p061_filterandmap;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> filterAndSquare(List<Integer> numbers) {
        if (numbers == null)
            return List.of();

        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}
