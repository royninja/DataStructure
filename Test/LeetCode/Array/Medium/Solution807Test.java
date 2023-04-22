package LeetCode.Array.Medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution807Test {

    @Test
    void test1(){
        Solution807 sol = new Solution807();
        assertEquals(35,sol.maxIncreaseKeepingSkyline(new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}));
    }

    @Test
    void test2(){
        Solution807 sol = new Solution807();
        assertEquals(0, sol.maxIncreaseKeepingSkyline(new int[][]{{0,0,0},{0,0,0},{0,0,0}}));
    }
}