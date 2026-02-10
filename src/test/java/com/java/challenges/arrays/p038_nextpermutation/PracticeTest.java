package com.java.challenges.arrays.p038_nextpermutation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testNextPerm() {
        int[] nums = {1,2,3};
        practice.nextPermutation(nums);
        assertThat(nums).containsExactly(1,3,2);
    }
    @Test void testLastPerm() {
        int[] nums = {3,2,1};
        practice.nextPermutation(nums);
        assertThat(nums).containsExactly(1,2,3);
    }
}