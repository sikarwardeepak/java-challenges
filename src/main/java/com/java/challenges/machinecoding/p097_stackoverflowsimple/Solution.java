package com.java.challenges.machinecoding.p097_stackoverflowsimple;

import java.util.*;

public class Solution {
    private final Map<Integer, String> questions;
    private final Map<Integer, List<String>> answers;
    private final Map<Integer, Integer> votes;
    private int nextId;

    public Solution() { questions = new HashMap<>(); answers = new HashMap<>(); votes = new HashMap<>(); nextId = 0; }
    public int postQuestion(String question) { int id = ++nextId; questions.put(id, question); votes.put(id, 0); answers.put(id, new ArrayList<>()); return id; }
    public void answerQuestion(int questionId, String answer) { answers.getOrDefault(questionId, new ArrayList<>()).add(answer); }
    public void upvote(int questionId) { votes.put(questionId, votes.getOrDefault(questionId, 0) + 1); }
    public int getVotes(int questionId) { return votes.getOrDefault(questionId, 0); }
}