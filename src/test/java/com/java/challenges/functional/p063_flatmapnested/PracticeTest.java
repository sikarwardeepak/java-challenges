package com.java.challenges.functional.p063_flatmapnested;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFlatten() {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5));
        assertThat(practice.flatten(input)).containsExactly(1,2,3,4,5);
    }
}