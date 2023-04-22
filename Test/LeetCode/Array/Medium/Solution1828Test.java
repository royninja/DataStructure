package LeetCode.Array.Medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1828Test {

    @Test
    void countPoints() {
        Solution1828 sol = new Solution1828();
        int[] answer = sol.countPoints(new int[][]{{1,3},{3,3},{5,3},{2,2}}, new int[][]{{2,3,1},{4,3,1},{1,1,2}});
        assertArrayEquals(new int[]{3,2,2}, answer);
        assertArrayEquals(new int[] {2,3,2,4},
                sol.countPoints(new int[][] {{1,1},{2,2},{3,3},{4,4},{5,5}}, new int[][]{{1,2,2},{2,2,2},{4,3,2},{4,3,3}}));
    }
}