package com.java.challenges.machinecoding.p096_pubsubsystem;

import java.util.*;
import java.util.function.Consumer;

public class Solution {
    private final Map<String, List<Consumer<String>>> subscribers;

    public Solution() { subscribers = new HashMap<>(); }
    public void subscribe(String topic, Consumer<String> listener) {
        subscribers.computeIfAbsent(topic, k -> new ArrayList<>()).add(listener);
    }
    public void publish(String topic, String message) {
        List<Consumer<String>> listeners = subscribers.getOrDefault(topic, Collections.emptyList());
        for (Consumer<String> listener : listeners) listener.accept(message);
    }
}