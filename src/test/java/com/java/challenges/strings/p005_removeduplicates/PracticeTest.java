package com.java.challenges.strings.p005_removeduplicates;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testRemoveDups() { assertThat(practice.removeDuplicates("programming")).isEqualTo("progamin"); }
    @Test void testNoDups() { assertThat(practice.removeDuplicates("abc")).isEqualTo("abc"); }
    @Test void testAllSame() { assertThat(practice.removeDuplicates("aaa")).isEqualTo("a"); }
}