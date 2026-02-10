package com.java.challenges.strings.p007_stringcompression;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testCompression() { assertThat(practice.compress("aabcccccaaa")).isEqualTo("a2b1c5a3"); }
    @Test void testNoCompression() { assertThat(practice.compress("abc")).isEqualTo("abc"); }
    @Test void testSingleChar() { assertThat(practice.compress("a")).isEqualTo("a"); }
}