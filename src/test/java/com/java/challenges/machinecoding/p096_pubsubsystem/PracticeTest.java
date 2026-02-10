package com.java.challenges.machinecoding.p096_pubsubsystem;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testPubSub() {
        Practice ps = new Practice();
        List<String> received = new ArrayList<>();
        ps.subscribe("news", received::add);
        ps.publish("news", "Breaking News!");
        assertThat(received).containsExactly("Breaking News!");
    }
}