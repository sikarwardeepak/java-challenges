package com.java.challenges.strings.p020_substringcount;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testCount() { assertThat(practice.countSubstring("ababab", "ab")).isEqualTo(3); }
    @Test void testNoOccurrence() { assertThat(practice.countSubstring("hello", "xyz")).isEqualTo(0); }
    @Test void testSingle() { assertThat(practice.countSubstring("hello", "hello")).isEqualTo(1); }
}