package com.java.challenges.functional.p061_filterandmap;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {

    private final Practice practice = new Practice();

    @Test
    void testFilterAndSquare() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = practice.filterAndSquare(input);

        assertThat(result).containsExactly(1, 9, 25);
    }

    @Test
    void testAllEven() {
        List<Integer> input = Arrays.asList(2, 4, 6);
        List<Integer> result = practice.filterAndSquare(input);
        assertThat(result).isEmpty();
    }
}
