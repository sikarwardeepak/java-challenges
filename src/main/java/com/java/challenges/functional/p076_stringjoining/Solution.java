package com.java.challenges.functional.p076_stringjoining;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public String join(List<String> words) {
        return words.stream().collect(Collectors.joining(", "));
    }
}