package com.java.challenges.arrays.p023_mergesortedarrays;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMerge() { assertThat(practice.merge(new int[]{1,3,5}, new int[]{2,4,6})).containsExactly(1,2,3,4,5,6); }
    @Test void testOneEmpty() { assertThat(practice.merge(new int[]{1,2}, new int[]{})).containsExactly(1,2); }
}