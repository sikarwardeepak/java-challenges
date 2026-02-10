package com.java.challenges.collections.p041_frequencycount;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {

    private final Practice practice = new Practice();

    @Test
    void testFrequencyCount() {
        List<String> input = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Integer> result = practice.countFrequency(input);

        assertThat(result)
                .containsEntry("apple", 3)
                .containsEntry("banana", 2)
                .containsEntry("cherry", 1);
    }

    @Test
    void testEmptyList() {
        List<String> input = Arrays.asList();
        Map<String, Integer> result = practice.countFrequency(input);
        assertThat(result).isEmpty();
    }
}
