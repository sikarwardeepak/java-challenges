package com.java.challenges.strings.p012_validpalindrome;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testValid() { assertThat(practice.validPalindrome("abca")).isTrue(); }
    @Test void testAlreadyPalindrome() { assertThat(practice.validPalindrome("aba")).isTrue(); }
    @Test void testInvalid() { assertThat(practice.validPalindrome("abc")).isFalse(); }
}