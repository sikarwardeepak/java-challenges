package com.java.challenges.machinecoding.p094_onlinevoting;

import java.util.*;

public class Solution {
    private final Map<String, Integer> candidates;
    private final Set<String> voters;

    public Solution() { candidates = new LinkedHashMap<>(); voters = new HashSet<>(); }
    public void registerCandidate(String name) { candidates.put(name, 0); }
    public boolean vote(String voterId, String candidateName) {
        if (voters.contains(voterId) || !candidates.containsKey(candidateName)) return false;
        voters.add(voterId);
        candidates.put(candidateName, candidates.get(candidateName) + 1);
        return true;
    }
    public Map<String, Integer> getResults() { return Collections.unmodifiableMap(candidates); }
    public String getWinner() {
        return candidates.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }
}