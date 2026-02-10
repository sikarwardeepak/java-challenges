package com.java.challenges.collections.p043_topkfrequentelements;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testTopK() { assertThat(practice.topKFrequent(new int[]{1,1,1,2,2,3}, 2)).containsExactlyInAnyOrder(1, 2); }
    @Test void testSingle() { assertThat(practice.topKFrequent(new int[]{1}, 1)).containsExactly(1); }
}