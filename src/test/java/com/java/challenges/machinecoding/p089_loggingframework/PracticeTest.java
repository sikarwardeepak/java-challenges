package com.java.challenges.machinecoding.p089_loggingframework;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testLogging() {
        Practice logger = new Practice(Practice.Level.INFO);
        logger.log(Practice.Level.DEBUG, "debug msg");
        logger.log(Practice.Level.INFO, "info msg");
        logger.log(Practice.Level.ERROR, "error msg");
        assertThat(logger.getLogs()).hasSize(2);
    }
}