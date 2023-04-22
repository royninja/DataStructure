package LeetCode.Array.Medium;

import java.util.Stack;

public class Solution2390 {
    public String removeStars(String s) {
        /*Input: s = "leet**cod*e"
        Output: "lecoe"*/
        //https://leetcode.com/problems/removing-stars-from-a-string/description/

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*'){
                if(!stack.isEmpty())
                    stack.pop();
            }else{
                stack.push(s.charAt(i));
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char item: stack) {
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }
}
