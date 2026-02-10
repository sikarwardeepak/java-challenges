package com.java.challenges.functional.p064_groupbyproperty;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testGroupByLength() {
        Map<Integer, List<String>> result = practice.groupByLength(Arrays.asList("hello","hi","hey","world","wow"));
        assertThat(result.get(5)).containsExactly("hello", "world");
        assertThat(result.get(2)).containsExactly("hi");
        assertThat(result.get(3)).containsExactly("hey", "wow");
    }
}