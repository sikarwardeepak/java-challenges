package com.java.challenges.arrays.p022_maxsubarraysum;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMaxSubArray() { assertThat(practice.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})).isEqualTo(6); }
    @Test void testAllNegative() { assertThat(practice.maxSubArray(new int[]{-1,-2,-3})).isEqualTo(-1); }
    @Test void testSingleElement() { assertThat(practice.maxSubArray(new int[]{5})).isEqualTo(5); }
}