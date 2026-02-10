package com.java.challenges.machinecoding.p090_taskmanager;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testTaskManager() {
        Practice tm = new Practice();
        tm.addTask("Low priority", 1);
        tm.addTask("High priority", 10);
        tm.addTask("Medium priority", 5);
        assertThat(tm.getPendingCount()).isEqualTo(3);
    }
}