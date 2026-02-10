package com.java.challenges.strings.p015_caesarcipher;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testEncrypt() { assertThat(practice.encrypt("Hello, World!", 3)).isEqualTo("Khoor, Zruog!"); }
    @Test void testDecrypt() { assertThat(practice.encrypt("Khoor", -3)).isEqualTo("Hello"); }
    @Test void testWrapAround() { assertThat(practice.encrypt("xyz", 3)).isEqualTo("abc"); }
}