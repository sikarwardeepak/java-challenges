package com.java.challenges.functional.p079_mapandcollect;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testToUpperSet() {
        assertThat(practice.toUpperSet(Arrays.asList("hello","world","hello"))).containsExactlyInAnyOrder("HELLO", "WORLD");
    }
}