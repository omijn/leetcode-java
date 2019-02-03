package io.github.omijn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

    @Test
    void numDecodings() {
        assertEquals(2, DecodeWays.numDecodings("12"));
        assertEquals(3, DecodeWays.numDecodings("226"));
        assertEquals(4, DecodeWays.numDecodings("2626"));
    }
}