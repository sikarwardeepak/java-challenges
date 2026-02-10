package com.java.challenges.machinecoding.p083_tictactoe;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testGame() {
        Practice game = new Practice(3);
        assertThat(game.move(0, 0, 1)).isEqualTo(0);
        assertThat(game.move(0, 2, 2)).isEqualTo(0);
        assertThat(game.move(2, 2, 1)).isEqualTo(0);
        assertThat(game.move(1, 1, 2)).isEqualTo(0);
        assertThat(game.move(1, 1, 1)).isEqualTo(0);
        //Player 1 wins when they get a full row/col/diagonal
    }
}