package com.java.challenges.functional.p066_optionalhandling;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFound() {
        assertThat(practice.findFirstWithPrefix(Arrays.asList("apple","banana","avocado"), "b")).isPresent().contains("banana");
    }
    @Test void testNotFound() {
        assertThat(practice.findFirstWithPrefix(Arrays.asList("apple","banana"), "z")).isEmpty();
    }
}