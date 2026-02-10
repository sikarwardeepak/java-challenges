package com.java.challenges.strings.p016_titlecase;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testTitleCase() { assertThat(practice.toTitleCase("hello world from java")).isEqualTo("Hello World From Java"); }
    @Test void testSingleWord() { assertThat(practice.toTitleCase("hello")).isEqualTo("Hello"); }
    @Test void testAlreadyTitle() { assertThat(practice.toTitleCase("Hello")).isEqualTo("Hello"); }
}