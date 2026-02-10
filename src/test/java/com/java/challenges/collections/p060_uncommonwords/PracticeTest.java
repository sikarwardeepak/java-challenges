package com.java.challenges.collections.p060_uncommonwords;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testUncommon() {
        assertThat(practice.uncommonFromSentences("this apple is sweet", "this apple is sour")).containsExactlyInAnyOrder("sweet", "sour");
    }
}