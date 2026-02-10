package com.java.challenges.strings.p001_reversestring;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {

    private final Practice practice = new Practice();

    @Test
    void testReverseSimple() {
        assertThat(practice.reverse("hello")).isEqualTo("olleh");
    }

    @Test
    void testReverseEmpty() {
        assertThat(practice.reverse("")).isEqualTo("");
    }

    @Test
    void testReverseNull() {
        assertThat(practice.reverse(null)).isNull(); // Or whatever the expected behavior is
    }
}
