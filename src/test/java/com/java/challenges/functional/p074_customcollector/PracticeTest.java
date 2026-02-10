package com.java.challenges.functional.p074_customcollector;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testJoin() {
        assertThat(practice.joinWithDelimiter(Arrays.asList("a","b","c"), ", ", "[", "]")).isEqualTo("[a, b, c]");
    }
}