package io.github.omijn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsInStringTest {

    @Test
    void findAnagrams() {
        assertEquals(new ArrayList<Integer>(List.of(0, 1, 2)), AnagramsInString.findAnagrams("abab", "ab"));
        assertEquals(new ArrayList<Integer>(List.of(0, 6)), AnagramsInString.findAnagrams("cbaebabacd", "abc"));
        assertEquals(new ArrayList<Integer>(List.of(1)), AnagramsInString.findAnagrams("baa", "aa"));
    }
}