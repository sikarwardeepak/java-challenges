package com.java.challenges.arrays.p040_pairsumtarget;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFindPairs() {
        assertThat(practice.findPairs(new int[]{1,5,7,1,5}, 6)).hasSize(2);
    }
    @Test void testNoPairs() {
        assertThat(practice.findPairs(new int[]{1,2,3}, 10)).isEmpty();
    }
}