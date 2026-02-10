package com.java.challenges.arrays.p028_findmissingnumber;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PracticeTest {
    private final Practice practice = new Practice();

    @Test void testMissing2() { assertThat(practice.missingNumber(new int[]{3,0,1})).isEqualTo(2); }
    @Test void testMissing8() { assertThat(practice.missingNumber(new int[]{9,6,4,2,3,5,7,0,1})).isEqualTo(8); }
    @Test void testMissing0() { assertThat(practice.missingNumber(new int[]{1})).isEqualTo(0); }
}