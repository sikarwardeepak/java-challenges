package com.java.challenges.functional.p076_stringjoining;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testJoin() {
        assertThat(practice.join(Arrays.asList("apple","banana","cherry"))).isEqualTo("apple, banana, cherry");
    }
}