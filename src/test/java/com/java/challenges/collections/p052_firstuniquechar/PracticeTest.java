package com.java.challenges.collections.p052_firstuniquechar;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFirstUniq() { assertThat(practice.firstUniqChar("leetcode")).isEqualTo(0); }
    @Test void testNoUniq() { assertThat(practice.firstUniqChar("aabb")).isEqualTo(-1); }
}