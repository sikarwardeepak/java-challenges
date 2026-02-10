package com.java.challenges.functional.p080_chainedoperations;

import java.util.List;

public class Solution {
    public int sumOfSquaresOfEvens(List<Integer> numbers) {
        return numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .reduce(0, Integer::sum);
    }
}