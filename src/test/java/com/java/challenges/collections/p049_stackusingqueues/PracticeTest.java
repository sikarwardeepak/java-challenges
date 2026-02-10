package com.java.challenges.collections.p049_stackusingqueues;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testStack() {
        Practice stack = new Practice();
        stack.push(1);
        stack.push(2);
        assertThat(stack.top()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.isEmpty()).isFalse();
    }
}