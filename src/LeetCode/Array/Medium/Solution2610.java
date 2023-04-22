package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class Solution2610 {
    public List<List<Integer>> findMatrix(int[] nums) { //{1,3,4,1,2,3,1}
        List<List<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> tempList = new ArrayList<Integer>();
            if(nums[i] != 0) {
                if (tempList.contains(nums[i]) == false) {
                    tempList.add(nums[i]);
                    nums[i] = 0;
                }
            }
            //finalList.add(tempList);
        }
        return finalList;
    }
}
