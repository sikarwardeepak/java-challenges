package com.java.challenges.arrays.p021_twosum;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {

    private final Practice practice = new Practice();

    @Test
    void testTwoSumExample() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = practice.twoSum(nums, target);
        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }

    @Test
    void testTwoSumExample2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] result = practice.twoSum(nums, target);
        assertThat(result).containsExactlyInAnyOrder(1, 2);
    }
}
