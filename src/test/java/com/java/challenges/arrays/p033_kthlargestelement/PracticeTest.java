package com.java.challenges.arrays.p033_kthlargestelement;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testKthLargest() { assertThat(practice.findKthLargest(new int[]{3,2,1,5,6,4}, 2)).isEqualTo(5); }
    @Test void testKthLargest2() { assertThat(practice.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)).isEqualTo(4); }
}