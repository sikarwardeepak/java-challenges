package com.java.challenges.strings.p014_stringrotation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testRotation() { assertThat(practice.isRotation("waterbottle", "erbottlewat")).isTrue(); }
    @Test void testNotRotation() { assertThat(practice.isRotation("hello", "world")).isFalse(); }
    @Test void testSameString() { assertThat(practice.isRotation("abc", "abc")).isTrue(); }
}