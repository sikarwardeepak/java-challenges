package com.java.challenges.functional.p063_flatmapnested;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> flatten(List<List<Integer>> nestedList) {
        return nestedList.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
    }
}