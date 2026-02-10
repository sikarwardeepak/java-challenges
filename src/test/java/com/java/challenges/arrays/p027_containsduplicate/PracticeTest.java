package com.java.challenges.arrays.p027_containsduplicate;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testHasDuplicate() { assertThat(practice.containsDuplicate(new int[]{1,2,3,1})).isTrue(); }
    @Test void testNoDuplicate() { assertThat(practice.containsDuplicate(new int[]{1,2,3,4})).isFalse(); }
}