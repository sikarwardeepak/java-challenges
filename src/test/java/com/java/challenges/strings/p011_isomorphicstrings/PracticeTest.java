package com.java.challenges.strings.p011_isomorphicstrings;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testIsomorphic() { assertThat(practice.isIsomorphic("egg", "add")).isTrue(); }
    @Test void testNotIsomorphic() { assertThat(practice.isIsomorphic("foo", "bar")).isFalse(); }
    @Test void testPaper() { assertThat(practice.isIsomorphic("paper", "title")).isTrue(); }
}