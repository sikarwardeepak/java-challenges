package com.java.challenges.collections.p053_wordpattern;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMatch() { assertThat(practice.wordPattern("abba", "dog cat cat dog")).isTrue(); }
    @Test void testNoMatch() { assertThat(practice.wordPattern("abba", "dog cat cat fish")).isFalse(); }
}