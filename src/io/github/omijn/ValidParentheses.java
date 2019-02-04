// https://leetcode.com/problems/valid-parentheses/

package io.github.omijn;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c: s.toCharArray()) {
            if (stack.size() != 0 && stack.peekFirst() == '(' && c == ')')
                stack.pollFirst();
            else if (stack.size() != 0 && stack.peekFirst() == '[' && c == ']')
                stack.pollFirst();
            else if (stack.size() != 0 && stack.peekFirst() == '{' && c == '}')
                stack.pollFirst();
            else
                stack.offerFirst(c);
        }

        return stack.size() == 0;
    }
}
