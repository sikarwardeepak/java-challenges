package com.java.challenges.strings.p018_pangram;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testPangram() { assertThat(practice.isPangram("The quick brown fox jumps over the lazy dog")).isTrue(); }
    @Test void testNotPangram() { assertThat(practice.isPangram("Hello World")).isFalse(); }
}