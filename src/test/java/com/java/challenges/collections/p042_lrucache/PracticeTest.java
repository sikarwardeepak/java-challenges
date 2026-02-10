package com.java.challenges.collections.p042_lrucache;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testLRUCache() {
        Practice cache = new Practice(2);
        cache.put(1, 1);
        cache.put(2, 2);
        assertThat(cache.get(1)).isEqualTo(1);
        cache.put(3, 3);
        assertThat(cache.get(2)).isEqualTo(-1);
        assertThat(cache.get(3)).isEqualTo(3);
    }
}