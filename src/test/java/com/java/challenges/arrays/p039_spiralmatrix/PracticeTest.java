package com.java.challenges.arrays.p039_spiralmatrix;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSpiral() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        assertThat(practice.spiralOrder(matrix)).containsExactly(1,2,3,6,9,8,7,4,5);
    }
}