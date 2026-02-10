package com.java.challenges.strings.p002_palindromecheck;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testPalindrome() { assertThat(practice.isPalindrome("racecar")).isTrue(); }
    @Test void testPalindromeWithSpaces() { assertThat(practice.isPalindrome("A man, a plan, a canal: Panama")).isTrue(); }
    @Test void testNotPalindrome() { assertThat(practice.isPalindrome("hello")).isFalse(); }
    @Test void testEmpty() { assertThat(practice.isPalindrome("")).isTrue(); }
}