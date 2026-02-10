package com.java.challenges.machinecoding.p094_onlinevoting;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testVoting() {
        Practice vs = new Practice();
        vs.registerCandidate("Alice");
        vs.registerCandidate("Bob");
        assertThat(vs.vote("voter1", "Alice")).isTrue();
        assertThat(vs.vote("voter2", "Alice")).isTrue();
        assertThat(vs.vote("voter1", "Bob")).isFalse(); // already voted
        assertThat(vs.getWinner()).isEqualTo("Alice");
    }
}