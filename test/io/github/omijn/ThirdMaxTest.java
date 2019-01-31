package io.github.omijn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaxTest {

    @Test
    void thirdMax() {
        ThirdMax q = new ThirdMax();
        assertEquals(2, q.thirdMax(new int[]{1, 2}));
        assertEquals(1, q.thirdMax(new int[]{3, 2, 1}));
        assertEquals(1, q.thirdMax(new int[]{2, 2, 3, 1}));
        assertEquals(1, q.thirdMax(new int[]{-2147483648, 1, 1}));
    }
}