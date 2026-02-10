package com.java.challenges.strings.p017_longestword;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testLongest() { assertThat(practice.longestWord("The quick brown fox jumped over the lazy dog")).isEqualTo("jumped"); }
    @Test void testSingleWord() { assertThat(practice.longestWord("hello")).isEqualTo("hello"); }
    @Test void testEmpty() { assertThat(practice.longestWord("")).isEqualTo(""); }
}