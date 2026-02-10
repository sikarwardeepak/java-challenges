package com.java.challenges.machinecoding.p082_parkinglot;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testParkAndLeave() {
        Practice lot = new Practice(2);
        assertThat(lot.getAvailableSlots()).isEqualTo(2);
        int slot1 = lot.park("CAR-001");
        assertThat(slot1).isGreaterThan(0);
        int slot2 = lot.park("CAR-002");
        assertThat(slot2).isGreaterThan(0);
        assertThat(lot.park("CAR-003")).isEqualTo(-1);
        lot.leave(slot1);
        assertThat(lot.getAvailableSlots()).isEqualTo(1);
    }
}