package com.java.challenges.arrays.p025_movezeroes;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMoveZeroes() {
        int[] nums = {0,1,0,3,12};
        practice.moveZeroes(nums);
        assertThat(nums).containsExactly(1,3,12,0,0);
    }
    @Test void testNoZeroes() {
        int[] nums = {1,2,3};
        practice.moveZeroes(nums);
        assertThat(nums).containsExactly(1,2,3);
    }
}