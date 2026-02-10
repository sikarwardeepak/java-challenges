package com.java.challenges.machinecoding.p088_snakeladder;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testMinThrows() {
        Practice practice = new Practice();
        Map<Integer, Integer> board = new HashMap<>();
        board.put(3, 22); // ladder
        board.put(5, 8);  // ladder
        board.put(27, 1); // snake
        assertThat(practice.minThrows(30, board)).isGreaterThan(0);
    }
}