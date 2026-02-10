package com.java.challenges.arrays.p037_searchinrotatedarray;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testFound() { assertThat(practice.search(new int[]{4,5,6,7,0,1,2}, 0)).isEqualTo(4); }
    @Test void testNotFound() { assertThat(practice.search(new int[]{4,5,6,7,0,1,2}, 3)).isEqualTo(-1); }
}