package com.java.challenges.arrays.p024_rotatearray;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testRotate() {
        int[] nums = {1,2,3,4,5,6,7};
        practice.rotate(nums, 3);
        assertThat(nums).containsExactly(5,6,7,1,2,3,4);
    }
}