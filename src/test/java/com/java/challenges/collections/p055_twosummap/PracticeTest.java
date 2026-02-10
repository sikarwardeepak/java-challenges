package com.java.challenges.collections.p055_twosummap;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testTwoSum() { assertThat(practice.twoSum(new int[]{2,7,11,15}, 9)).containsExactly(0, 1); }
}