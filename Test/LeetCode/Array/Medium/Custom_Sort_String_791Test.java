package LeetCode.Array.Medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Custom_Sort_String_791Test {
    Custom_Sort_String_791 sol = new Custom_Sort_String_791();
    @Test
    void customSortStringTest1() {
        assertEquals("cbad",sol.customSortString("cba","abcd"));
    }
    @Test
    void customSortStringTest2() {
        assertEquals("cbad",sol.customSortString("cbafg","abcd"));
    }
}