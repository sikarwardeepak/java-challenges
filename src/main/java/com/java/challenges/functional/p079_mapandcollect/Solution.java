package com.java.challenges.functional.p079_mapandcollect;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public Set<String> toUpperSet(List<String> words) {
        return words.stream().map(String::toUpperCase).collect(Collectors.toSet());
    }
}