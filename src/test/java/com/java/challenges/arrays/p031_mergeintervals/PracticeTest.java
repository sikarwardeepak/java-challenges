package com.java.challenges.arrays.p031_mergeintervals;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMerge() {
        int[][] result = practice.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        assertThat(result).isDeepEqualTo(new int[][]{{1,6},{8,10},{15,18}});
    }
}