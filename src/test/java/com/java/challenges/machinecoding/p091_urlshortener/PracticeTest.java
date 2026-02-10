package com.java.challenges.machinecoding.p091_urlshortener;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testUrlShortener() {
        Practice us = new Practice();
        String shortUrl = us.shorten("https://www.google.com/search?q=java");
        assertThat(shortUrl).isNotEmpty();
        assertThat(us.resolve(shortUrl)).isEqualTo("https://www.google.com/search?q=java");
        assertThat(us.resolve("nonexistent")).isNull();
    }
}