package com.java.challenges.machinecoding.p087_splitwise;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class PracticeTest {
    @Test void testSplitwise() {
        Practice sw = new Practice();
        sw.addExpense("Alice", Arrays.asList("Alice", "Bob", "Charlie"), 300);
        assertThat(sw.getBalance("Alice")).isCloseTo(200.0, within(0.01));
        assertThat(sw.getBalance("Bob")).isCloseTo(-100.0, within(0.01));
    }
}