package com.java.challenges.functional.p065_customcomparator;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSort() {
        assertThat(practice.sortByLength(Arrays.asList("banana","apple","kiwi","fig")))
            .containsExactly("fig","kiwi","apple","banana");
    }
}