package LeetCode.Array.Medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2545Test {

    Solution2545 sol = new Solution2545();

    @Test
    void sortTheStudentsTest1() {
        assertArrayEquals(new int[][]{{7,5,11,2},{10,6,9,1},{4,8,3,15}}, sol.sortTheStudents(new int[][]{{10,6,9,1},{7,5,11,2},{4,8,3,15}},2));
    }
    @Test
    void sortTheStudentsTest2() {
        assertArrayEquals(new int[][]{{5,6},{3,4}},sol.sortTheStudents(new int[][]{{3,4},{5,6}},0));
    }
}