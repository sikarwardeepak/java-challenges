package com.java.challenges.machinecoding.p084_vendingmachine;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testVendingMachine() {
        Practice vm = new Practice();
        vm.addProduct("Coke", 1.50, 5);
        vm.insertCoin(2.00);
        assertThat(vm.selectProduct("Coke")).isTrue();
        assertThat(vm.getBalance()).isEqualTo(0.50);
        assertThat(vm.selectProduct("Pepsi")).isFalse();
    }
}