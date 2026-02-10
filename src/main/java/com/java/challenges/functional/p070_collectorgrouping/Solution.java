package com.java.challenges.functional.p070_collectorgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public Map<Character, Long> groupAndCount(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(w -> w.charAt(0), Collectors.counting()));
    }
}