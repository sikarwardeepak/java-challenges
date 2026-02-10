package com.java.challenges.collections.p051_minstack;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testMinStack() {
        Practice ms = new Practice();
        ms.push(-2); ms.push(0); ms.push(-3);
        assertThat(ms.getMin()).isEqualTo(-3);
        ms.pop();
        assertThat(ms.top()).isEqualTo(0);
        assertThat(ms.getMin()).isEqualTo(-2);
    }
}