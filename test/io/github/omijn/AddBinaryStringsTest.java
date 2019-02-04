package io.github.omijn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryStringsTest {

    @Test
    void addBinary() {
        assertEquals("10101", AddBinaryStrings.addBinary("1010", "1011"));
        assertEquals("100", AddBinaryStrings.addBinary("11", "1"));
        assertEquals("0", AddBinaryStrings.addBinary("0", "0"));
    }
}