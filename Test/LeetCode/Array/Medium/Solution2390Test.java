package LeetCode.Array.Medium;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2390Test {


    @Test
    void test1(){
        Solution2390 sol = new Solution2390();
        assertEquals("lecoe",sol.removeStars("leet**cod*e"));
    }

    @Test
    void test2(){
        Solution2390 sol = new Solution2390();
        assertEquals("",sol.removeStars("erase*****"));
    }

}