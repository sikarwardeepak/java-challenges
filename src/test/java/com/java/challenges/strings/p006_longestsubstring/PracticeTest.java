package com.java.challenges.strings.p006_longestsubstring;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testAbcabcbb() { assertThat(practice.lengthOfLongestSubstring("abcabcbb")).isEqualTo(3); }
    @Test void testBbbbb() { assertThat(practice.lengthOfLongestSubstring("bbbbb")).isEqualTo(1); }
    @Test void testPwwkew() { assertThat(practice.lengthOfLongestSubstring("pwwkew")).isEqualTo(3); }
    @Test void testEmpty() { assertThat(practice.lengthOfLongestSubstring("")).isEqualTo(0); }
}