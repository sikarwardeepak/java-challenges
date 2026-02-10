package com.java.challenges.functional.p069_functioncomposition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testTransform() { assertThat(practice.transform("  Hello World  ")).isEqualTo("hello-world"); }
    @Test void testSingle() { assertThat(practice.transform("  JAVA  ")).isEqualTo("java"); }
}