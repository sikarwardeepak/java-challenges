package com.java.challenges.collections.p048_sortmapbyvalue;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSortByValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 3); map.put("apple", 1); map.put("cherry", 2);
        Map<String, Integer> result = practice.sortByValue(map);
        assertThat(new ArrayList<>(result.values())).containsExactly(1, 2, 3);
    }
}