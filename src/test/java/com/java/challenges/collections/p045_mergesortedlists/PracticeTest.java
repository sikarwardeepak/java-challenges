package com.java.challenges.collections.p045_mergesortedlists;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMerge() {
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1,4,5), Arrays.asList(1,3,4), Arrays.asList(2,6));
        assertThat(practice.mergeKLists(lists)).containsExactly(1,1,2,3,4,4,5,6);
    }
}