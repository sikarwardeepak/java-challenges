package com.java.challenges.collections.p047_intersectionofarrays;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testIntersection() { assertThat(practice.intersection(new int[]{1,2,2,1}, new int[]{2,2})).containsExactly(2); }
    @Test void testNoIntersection() { assertThat(practice.intersection(new int[]{1,2}, new int[]{3,4})).isEmpty(); }
}