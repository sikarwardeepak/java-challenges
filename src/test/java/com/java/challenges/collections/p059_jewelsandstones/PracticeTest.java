package com.java.challenges.collections.p059_jewelsandstones;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testJewels() { assertThat(practice.numJewelsInStones("aA", "aAAbbbb")).isEqualTo(3); }
    @Test void testNoJewels() { assertThat(practice.numJewelsInStones("z", "ZZ")).isEqualTo(0); }
}