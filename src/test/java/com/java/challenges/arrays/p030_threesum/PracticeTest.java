package com.java.challenges.arrays.p030_threesum;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testThreeSum() {
        List<List<Integer>> result = practice.threeSum(new int[]{-1,0,1,2,-1,-4});
        assertThat(result).hasSize(2);
    }
    @Test void testNoTriplet() { assertThat(practice.threeSum(new int[]{1,2,3})).isEmpty(); }
}