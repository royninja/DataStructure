package LeetCode.Stack.Easy;

import java.util.Stack;

public class Solution1614 {
    Stack<Character> my_stack = new Stack<Character>();
    int stack_size;

    public int maxDepth(String s) {
        if (s.isEmpty() || !s.contains("(") || !s.contains(")")) {
            return 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                my_stack.push('(');
            } else if (s.charAt(i) == ')') {
                my_stack.pop();
                int temp = my_stack.size();
                if (stack_size < temp) {
                    stack_size = temp;
                }
            }

        }
        return stack_size + 1;
    }
}