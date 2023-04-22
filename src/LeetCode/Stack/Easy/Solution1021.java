package LeetCode.Stack.Easy;

import java.util.Stack;

public class Solution1021 {

    public String removeOuterParentheses(String s) {
        //https://leetcode.com/problems/remove-outermost-parentheses/description/
        //need to revisit later
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(stack.size() > 0){
                    stringBuilder.append('(');
                }
                stack.push('(');
            }else{
                if(s.charAt(i) == ')'){
                    if(stack.size() > 1){
                        stringBuilder.append(')');
                    }
                    stack.pop();
                }
            }
        }
        return stringBuilder.toString();

    }
}
