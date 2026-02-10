package com.java.challenges.functional.p072_reducetomax;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMax() { assertThat(practice.findMax(Arrays.asList(3,1,4,1,5,9,2,6))).isEqualTo(9); }
    @Test void testSingle() { assertThat(practice.findMax(Arrays.asList(42))).isEqualTo(42); }
}