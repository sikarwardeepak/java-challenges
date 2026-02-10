package com.java.challenges.machinecoding.p085_elevatorsystem;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testElevator() {
        Practice elevator = new Practice();
        assertThat(elevator.getCurrentFloor()).isEqualTo(0);
        elevator.requestFloor(5);
        elevator.requestFloor(3);
        assertThat(elevator.getPendingRequests()).isEqualTo(2);
        assertThat(elevator.moveNext()).isEqualTo(3);
    }
}