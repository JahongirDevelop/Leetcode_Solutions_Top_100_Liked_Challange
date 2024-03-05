package org.example.easy;

import java.util.Stack;

public class Problem_20_ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no corresponding opening bracket
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // If stack is empty, all brackets were matched
    }
}
