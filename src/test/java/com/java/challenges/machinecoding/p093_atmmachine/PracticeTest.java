package com.java.challenges.machinecoding.p093_atmmachine;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testATM() {
        Practice atm = new Practice();
        atm.createAccount("ACC001", 1000, 1234);
        assertThat(atm.checkBalance("ACC001", 1234)).isEqualTo(1000);
        assertThat(atm.checkBalance("ACC001", 0000)).isEqualTo(-1);
        assertThat(atm.withdraw("ACC001", 1234, 500)).isTrue();
        assertThat(atm.checkBalance("ACC001", 1234)).isEqualTo(500);
    }
}