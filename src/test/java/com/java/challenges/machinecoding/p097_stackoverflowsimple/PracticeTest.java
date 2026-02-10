package com.java.challenges.machinecoding.p097_stackoverflowsimple;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testQA() {
        Practice qa = new Practice();
        int qId = qa.postQuestion("How to learn Java?");
        qa.answerQuestion(qId, "Read a book");
        qa.upvote(qId);
        qa.upvote(qId);
        assertThat(qa.getVotes(qId)).isEqualTo(2);
    }
}