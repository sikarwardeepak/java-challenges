package com.java.challenges.arrays.p026_productexceptself;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testProduct() { assertThat(practice.productExceptSelf(new int[]{1,2,3,4})).containsExactly(24,12,8,6); }
    @Test void testWithZero() { assertThat(practice.productExceptSelf(new int[]{-1,1,0,-3,3})).containsExactly(0,0,9,0,0); }
}