package com.java.challenges.functional.p062_reducesum;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSum() { assertThat(practice.sum(Arrays.asList(1,2,3,4,5))).isEqualTo(15); }
    @Test void testEmpty() { assertThat(practice.sum(Arrays.asList())).isEqualTo(0); }
}