package com.java.challenges.functional.p070_collectorgrouping;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testGroupAndCount() {
        Map<Character, Long> result = practice.groupAndCount(Arrays.asList("apple","avocado","banana","blueberry","cherry"));
        assertThat(result).containsEntry('a', 2L).containsEntry('b', 2L).containsEntry('c', 1L);
    }
}