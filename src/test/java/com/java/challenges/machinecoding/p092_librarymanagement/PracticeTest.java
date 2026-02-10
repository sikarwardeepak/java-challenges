package com.java.challenges.machinecoding.p092_librarymanagement;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    @Test void testLibrary() {
        Practice lib = new Practice();
        lib.addBook("Clean Code", 2);
        assertThat(lib.borrowBook("Clean Code")).isTrue();
        assertThat(lib.borrowBook("Clean Code")).isTrue();
        assertThat(lib.borrowBook("Clean Code")).isFalse();
        lib.returnBook("Clean Code");
        assertThat(lib.borrowBook("Clean Code")).isTrue();
    }
}