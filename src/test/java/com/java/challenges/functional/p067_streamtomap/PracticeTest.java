package com.java.challenges.functional.p067_streamtomap;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testToMap() {
        Map<String, Integer> result = practice.toMap(Arrays.asList("hello","world"));
        assertThat(result).containsEntry("hello", 5).containsEntry("world", 5);
    }
}