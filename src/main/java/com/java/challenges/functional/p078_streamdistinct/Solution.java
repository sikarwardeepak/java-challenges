package com.java.challenges.functional.p078_streamdistinct;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }
}