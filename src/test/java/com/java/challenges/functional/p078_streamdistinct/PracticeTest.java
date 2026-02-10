package com.java.challenges.functional.p078_streamdistinct;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testDistinct() {
        assertThat(practice.removeDuplicates(Arrays.asList(1,2,2,3,3,3,4))).containsExactly(1, 2, 3, 4);
    }
}