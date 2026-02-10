package com.java.challenges.strings.p009_longestcommonprefix;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testCommonPrefix() { assertThat(practice.longestCommonPrefix(new String[]{"flower","flow","flight"})).isEqualTo("fl"); }
    @Test void testNoCommonPrefix() { assertThat(practice.longestCommonPrefix(new String[]{"dog","racecar","car"})).isEqualTo(""); }
    @Test void testSingleString() { assertThat(practice.longestCommonPrefix(new String[]{"alone"})).isEqualTo("alone"); }
}