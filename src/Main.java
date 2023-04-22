import LeetCode.String.Easy.Solution1768;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Solution1768 sol = new Solution1768();
        System.out.println(sol.mergeAlternately("abc","pqr"));
        System.out.println(sol.mergeAlternately("ab","pqrs"));
        System.out.println(sol.mergeAlternately("abcd","pq"));
        System.out.println(sol.mergeAlternately("","pq"));
        System.out.println(sol.mergeAlternately("abcd",""));


    }
}