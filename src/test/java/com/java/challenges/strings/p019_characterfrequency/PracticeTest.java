package com.java.challenges.strings.p019_characterfrequency;

import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFrequency() {
        Map<Character, Integer> result = practice.charFrequency("hello");
        assertThat(result).containsEntry('h', 1).containsEntry('l', 2).containsEntry('o', 1);
    }
    @Test void testEmpty() { assertThat(practice.charFrequency("")).isEmpty(); }
}