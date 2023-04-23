package LeetCode.Array.Medium;

import java.util.*;
/*
Need to Study about comparator
https://www.geeksforgeeks.org/sorting-2d-array-according-values-given-column-java/
https://www.geeksforgeeks.org/sort-arraylist-in-descending-order-using-comparator-in-java/
https://leetcode.com/problems/sort-the-students-by-their-kth-score/
comparator can be replaced with lambda  Arrays.sort(A, (a, b) -> b[k] - a[k]);
 */
public class Solution2545 {
    public int[][] sortTheStudents(int[][] score, int k) {
        //this comparator can be use and also the lambda expression
        /*Arrays.sort(score, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[k] < o2[k])
                    return 1;
                else
                    return -1;
            }
        });*/
        Arrays.sort(score, (a,b) -> b[k] - a[k]);
        return score;
    }

}
