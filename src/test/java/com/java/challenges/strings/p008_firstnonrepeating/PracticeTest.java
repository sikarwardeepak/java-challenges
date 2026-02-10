package com.java.challenges.strings.p008_firstnonrepeating;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testLeetcode() { assertThat(practice.firstUniqChar("leetcode")).isEqualTo(0); }
    @Test void testLoveleetcode() { assertThat(practice.firstUniqChar("loveleetcode")).isEqualTo(2); }
    @Test void testAabb() { assertThat(practice.firstUniqChar("aabb")).isEqualTo(-1); }
}