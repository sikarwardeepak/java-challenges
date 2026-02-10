package com.java.challenges.strings.p003_anagramcheck;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testAnagram() { assertThat(practice.isAnagram("anagram", "nagaram")).isTrue(); }
    @Test void testNotAnagram() { assertThat(practice.isAnagram("rat", "car")).isFalse(); }
    @Test void testSingleChar() { assertThat(practice.isAnagram("a", "a")).isTrue(); }
}