package com.java.challenges.arrays.p029_besttimetobuysellstock;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testProfit() { assertThat(practice.maxProfit(new int[]{7,1,5,3,6,4})).isEqualTo(5); }
    @Test void testNoProfit() { assertThat(practice.maxProfit(new int[]{7,6,4,3,1})).isEqualTo(0); }
}