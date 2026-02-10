package com.java.challenges.functional.p069_functioncomposition;

import java.util.function.Function;

public class Solution {
    public String transform(String input) {
        Function<String, String> trim = String::trim;
        Function<String, String> lower = String::toLowerCase;
        Function<String, String> hyphenate = s -> s.replaceAll("\\s+", "-");
        return trim.andThen(lower).andThen(hyphenate).apply(input);
    }
}