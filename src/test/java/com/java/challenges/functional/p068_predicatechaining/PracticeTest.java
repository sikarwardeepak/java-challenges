package com.java.challenges.functional.p068_predicatechaining;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFilter() {
        assertThat(practice.filterPositiveEven(Arrays.asList(-1, 2, -3, 4, 5, 6))).containsExactly(2, 4, 6);
    }
}