package com.java.challenges.functional.p066_optionalhandling;

import java.util.*;

public class Solution {
    public Optional<String> findFirstWithPrefix(List<String> strings, String prefix) {
        return strings.stream().filter(s -> s.startsWith(prefix)).findFirst();
    }
}