package com.java.challenges.arrays.p032_sortcolors;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSort() {
        int[] nums = {2,0,2,1,1,0};
        practice.sortColors(nums);
        assertThat(nums).containsExactly(0,0,1,1,2,2);
    }
}