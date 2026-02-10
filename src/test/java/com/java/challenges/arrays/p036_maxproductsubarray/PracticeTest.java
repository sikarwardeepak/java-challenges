package com.java.challenges.arrays.p036_maxproductsubarray;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMaxProduct() { assertThat(practice.maxProduct(new int[]{2,3,-2,4})).isEqualTo(6); }
    @Test void testNegatives() { assertThat(practice.maxProduct(new int[]{-2,0,-1})).isEqualTo(0); }
}