package com.java.challenges.functional.p071_partitionby;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testPartition() {
        Map<Boolean, List<Integer>> result = practice.partitionEvenOdd(Arrays.asList(1,2,3,4,5,6));
        assertThat(result.get(true)).containsExactly(2, 4, 6);
        assertThat(result.get(false)).containsExactly(1, 3, 5);
    }
}