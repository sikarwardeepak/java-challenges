package com.java.challenges.functional.p075_peekandforeach;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testDouble() {
        assertThat(practice.doubleAndCollect(Arrays.asList(1,2,3))).containsExactly(2, 4, 6);
    }
}