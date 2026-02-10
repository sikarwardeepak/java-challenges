package com.java.challenges.machinecoding.p095_inventorymanagement;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testInventory() {
        Practice inv = new Practice();
        inv.addItem("Laptop", 10, 999);
        assertThat(inv.getQuantity("Laptop")).isEqualTo(10);
        inv.updateQuantity("Laptop", -3);
        assertThat(inv.getQuantity("Laptop")).isEqualTo(7);
        assertThat(inv.removeItem("Laptop")).isTrue();
        assertThat(inv.getQuantity("Laptop")).isEqualTo(-1);
    }
}