package com.java.challenges.machinecoding.p099_calendarscheduler;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testScheduler() {
        Practice scheduler = new Practice();
        assertThat(scheduler.bookMeeting(9, 10)).isTrue();
        assertThat(scheduler.bookMeeting(10, 11)).isTrue();
        assertThat(scheduler.bookMeeting(9, 11)).isFalse(); // overlaps
        assertThat(scheduler.isAvailable(11, 12)).isTrue();
    }
}