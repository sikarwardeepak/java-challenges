package com.java.challenges.machinecoding.p086_inmemoryfilesystem;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testFileSystem() {
        Practice fs = new Practice();
        fs.mkdir("/docs");
        fs.addFile("/docs/readme.txt", "Hello World");
        assertThat(fs.readFile("/docs/readme.txt")).isEqualTo("Hello World");
        assertThat(fs.readFile("/nonexistent")).isNull();
    }
}