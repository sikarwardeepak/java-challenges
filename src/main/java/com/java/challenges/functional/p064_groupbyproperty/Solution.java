package com.java.challenges.functional.p064_groupbyproperty;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public Map<Integer, List<String>> groupByLength(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(String::length));
    }
}