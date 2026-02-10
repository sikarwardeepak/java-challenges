package com.java.challenges.strings.p013_countandsay;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testN1() { assertThat(practice.countAndSay(1)).isEqualTo("1"); }
    @Test void testN4() { assertThat(practice.countAndSay(4)).isEqualTo("1211"); }
    @Test void testN5() { assertThat(practice.countAndSay(5)).isEqualTo("111221"); }
}