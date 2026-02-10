package com.java.challenges.arrays.p034_subarraysumequalsk;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSubarraySum() { assertThat(practice.subarraySum(new int[]{1,1,1}, 2)).isEqualTo(2); }
    @Test void testSubarraySum2() { assertThat(practice.subarraySum(new int[]{1,2,3}, 3)).isEqualTo(2); }
}