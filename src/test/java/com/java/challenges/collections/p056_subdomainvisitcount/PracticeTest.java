package com.java.challenges.collections.p056_subdomainvisitcount;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testSubdomain() {
        String[] input = {"9001 discuss.leetcode.com"};
        assertThat(practice.subdomainVisits(input)).hasSize(3);
    }
}