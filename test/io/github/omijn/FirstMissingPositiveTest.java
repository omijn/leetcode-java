package io.github.omijn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstMissingPositiveTest {

    @Test
    void firstMissingPositive() {
        assertEquals(3, FirstMissingPositive.firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, FirstMissingPositive.firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, FirstMissingPositive.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}