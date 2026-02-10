package com.java.challenges.collections.p058_ransomnote;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testCan() { assertThat(practice.canConstruct("aa", "aab")).isTrue(); }
    @Test void testCannot() { assertThat(practice.canConstruct("a", "b")).isFalse(); }
}