package com.java.challenges.functional.p065_customcomparator;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<String> sortByLength(List<String> words) {
        return words.stream()
            .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
            .collect(Collectors.toList());
    }
}