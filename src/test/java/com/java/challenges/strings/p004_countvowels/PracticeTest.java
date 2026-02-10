package com.java.challenges.strings.p004_countvowels;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testHelloWorld() { assertThat(practice.countVowels("Hello World")).isEqualTo(3); }
    @Test void testAllVowels() { assertThat(practice.countVowels("aeiou")).isEqualTo(5); }
    @Test void testNoVowels() { assertThat(practice.countVowels("bcdf")).isEqualTo(0); }
    @Test void testEmpty() { assertThat(practice.countVowels("")).isEqualTo(0); }
}