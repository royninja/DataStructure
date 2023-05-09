import LeetCode.Array.Medium.Solution2215;
import LeetCode.Array.Medium.Solution2545;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Solution2215 sol = new Solution2215();
        //List<List<Integer>> list = new ArrayList<>();
        //list = sol.findDifference(new int[] {1,2,3}, new int[]{2,4,6});
        int arr[] = {1,2,3};
        int check = 2;
        int loc = Arrays.binarySearch(arr,2);
        boolean flag = loc >= 0 ? true : false;
        System.out.println(flag);
    }
}