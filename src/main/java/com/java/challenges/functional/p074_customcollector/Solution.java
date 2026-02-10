package com.java.challenges.functional.p074_customcollector;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public String joinWithDelimiter(List<String> items, String delimiter, String prefix, String suffix) {
        return items.stream().collect(Collectors.joining(delimiter, prefix, suffix));
    }
}