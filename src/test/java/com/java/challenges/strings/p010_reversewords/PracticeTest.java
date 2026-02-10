package com.java.challenges.strings.p010_reversewords;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testReverseWords() { assertThat(practice.reverseWords("the sky is blue")).isEqualTo("blue is sky the"); }
    @Test void testSingleWord() { assertThat(practice.reverseWords("hello")).isEqualTo("hello"); }
    @Test void testExtraSpaces() { assertThat(practice.reverseWords("  hello world  ")).isEqualTo("world hello"); }
}