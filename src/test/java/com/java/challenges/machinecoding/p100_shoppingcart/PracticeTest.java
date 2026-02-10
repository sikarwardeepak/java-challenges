package com.java.challenges.machinecoding.p100_shoppingcart;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class PracticeTest {
    @Test void testCart() {
        Practice cart = new Practice();
        cart.addItem("Apple", 1.50, 3);
        cart.addItem("Banana", 0.75, 2);
        assertThat(cart.getTotal()).isCloseTo(6.0, within(0.01));
        cart.applyDiscount(10);
        assertThat(cart.getTotal()).isCloseTo(5.4, within(0.01));
        assertThat(cart.getItemCount()).isEqualTo(2);
    }
}