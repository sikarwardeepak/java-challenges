package com.java.challenges.machinecoding.p081_ratelimiter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {

    @Test
    void testRateLimiterBasic() {
        Practice practice = new Practice(2, 1); // 2 requests per 1 second

        assertThat(practice.allowRequest("user1")).isTrue();
        assertThat(practice.allowRequest("user1")).isTrue();

        // This should theoretically fail if implemented correctly, but the stub returns
        // true always.
        // So the test expects false here to prove the implementation handles the limit.
        assertThat(practice.allowRequest("user1")).isFalse();
    }

    @Test
    void testRateLimiterDifferentClients() {
        Practice practice = new Practice(1, 1);
        assertThat(practice.allowRequest("userA")).isTrue();
        assertThat(practice.allowRequest("userB")).isTrue(); // Different client, should be allowed
    }
}
