package com.java.challenges.collections.p044_groupbyage;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testGroupByAge() {
        List<String[]> people = Arrays.asList(new String[]{"Alice","25"}, new String[]{"Bob","30"}, new String[]{"Charlie","25"});
        Map<Integer, List<String>> result = practice.groupByAge(people);
        assertThat(result.get(25)).containsExactly("Alice", "Charlie");
        assertThat(result.get(30)).containsExactly("Bob");
    }
}