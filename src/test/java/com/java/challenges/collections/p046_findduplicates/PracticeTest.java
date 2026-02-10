package com.java.challenges.collections.p046_findduplicates;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFindDuplicates() { assertThat(practice.findDuplicates(new int[]{4,3,2,7,8,2,3,1})).containsExactlyInAnyOrder(2, 3); }
    @Test void testNoDuplicates() { assertThat(practice.findDuplicates(new int[]{1,2,3})).isEmpty(); }
}