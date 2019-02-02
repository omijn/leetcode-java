package io.github.omijn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    @Test
    void wordBreak() {
        assertTrue(WordBreak.wordBreak("leetcode", new ArrayList<String>(List.of("leet", "code"))));
        assertTrue(WordBreak.wordBreak("applepenapple", new ArrayList<String>(List.of("apple", "pen"))));
        assertFalse(WordBreak.wordBreak("catsandog", new ArrayList<String>(List.of("cats", "dog", "sand", "and", "cat"))));
    }
}