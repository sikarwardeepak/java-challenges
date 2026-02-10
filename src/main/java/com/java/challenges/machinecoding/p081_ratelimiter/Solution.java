package com.java.challenges.machinecoding.p081_ratelimiter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private final int maxRequests;
    private final long timeWindowMillis;
    private final Map<String, List<Long>> clientRequests;

    public Solution(int maxRequests, int timeWindowInSeconds) {
        this.maxRequests = maxRequests;
        this.timeWindowMillis = timeWindowInSeconds * 1000L;
        this.clientRequests = new HashMap<>();
    }

    public synchronized boolean allowRequest(String clientId) {
        long currentTime = System.currentTimeMillis();
        clientRequests.putIfAbsent(clientId, new ArrayList<>());
        List<Long> timestamps = clientRequests.get(clientId);

        // Remove old timestamps
        timestamps.removeIf(t -> currentTime - t > timeWindowMillis);

        if (timestamps.size() < maxRequests) {
            timestamps.add(currentTime);
            return true;
        }
        return false;
    }
}
