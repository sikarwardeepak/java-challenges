package com.java.challenges.functional.p073_streamgenerate;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFibonacci() {
        assertThat(practice.fibonacci(7)).containsExactly(0L, 1L, 1L, 2L, 3L, 5L, 8L);
    }
    @Test void testSingle() { assertThat(practice.fibonacci(1)).containsExactly(0L); }
}