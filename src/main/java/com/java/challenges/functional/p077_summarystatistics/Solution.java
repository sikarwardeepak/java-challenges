package com.java.challenges.functional.p077_summarystatistics;

import java.util.*;

public class Solution {
    public IntSummaryStatistics getStats(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
    }
}