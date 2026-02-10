package com.java.challenges.functional.p075_peekandforeach;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> doubleAndCollect(List<Integer> numbers) {
        return numbers.stream()
            .map(n -> n * 2)
            .peek(n -> { /* logging side effect */ })
            .collect(Collectors.toList());
    }
}