package com.java.challenges.functional.p067_streamtomap;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public Map<String, Integer> toMap(List<String> words) {
        return words.stream().collect(Collectors.toMap(w -> w, String::length));
    }
}