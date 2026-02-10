package com.java.challenges.collections.p050_queueusingstacks;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testQueue() {
        Practice queue = new Practice();
        queue.push(1);
        queue.push(2);
        assertThat(queue.peek()).isEqualTo(1);
        assertThat(queue.pop()).isEqualTo(1);
        assertThat(queue.isEmpty()).isFalse();
    }
}