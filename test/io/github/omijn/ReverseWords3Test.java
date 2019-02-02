package io.github.omijn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWords3Test {

    @Test
    void reverseWords() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWords3.reverseWords("Let's take LeetCode contest"));
    }
}