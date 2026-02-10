package com.java.challenges.arrays.p035_jumpgame;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testCanJump() { assertThat(practice.canJump(new int[]{2,3,1,1,4})).isTrue(); }
    @Test void testCannotJump() { assertThat(practice.canJump(new int[]{3,2,1,0,4})).isFalse(); }
}