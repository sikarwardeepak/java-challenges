package com.java.challenges.collections.p054_removeallelement;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testRemove() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3,2,2,3));
        assertThat(practice.removeElement(nums, 3)).isEqualTo(2);
    }
}