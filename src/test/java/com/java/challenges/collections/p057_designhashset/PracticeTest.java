package com.java.challenges.collections.p057_designhashset;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testHashSet() {
        Practice hs = new Practice();
        hs.add(1); hs.add(2);
        assertThat(hs.contains(1)).isTrue();
        assertThat(hs.contains(3)).isFalse();
        hs.add(2);
        assertThat(hs.contains(2)).isTrue();
        hs.remove(2);
        assertThat(hs.contains(2)).isFalse();
    }
}