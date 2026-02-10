package com.java.challenges.functional.p080_chainedoperations;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSumOfSquares() {
        assertThat(practice.sumOfSquaresOfEvens(Arrays.asList(1,2,3,4,5,6))).isEqualTo(56);
    }
    @Test void testEmpty() {
        assertThat(practice.sumOfSquaresOfEvens(Arrays.asList())).isEqualTo(0);
    }
}