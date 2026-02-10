package com.java.challenges.functional.p077_summarystatistics;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testStats() {
        IntSummaryStatistics stats = practice.getStats(Arrays.asList(1,2,3,4,5));
        assertThat(stats.getCount()).isEqualTo(5);
        assertThat(stats.getSum()).isEqualTo(15);
        assertThat(stats.getMin()).isEqualTo(1);
        assertThat(stats.getMax()).isEqualTo(5);
    }
}