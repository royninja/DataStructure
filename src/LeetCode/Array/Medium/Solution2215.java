package LeetCode.Array.Medium;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Solution2215 {

    public List<Integer> helper(int[] nums1, int[] nums2){
        Set<Integer> only_element = new HashSet<>();

        for (int item:nums1) {
            boolean found = false;
            for (int x: nums2) {
                if(item == x)
                {
                    found = true;
                    break;
                }
            }
            if(!found){
                only_element.add(item);
            }
        }
        return new ArrayList<>(only_element);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //return Arrays.asList(helper(nums1,nums2),helper(nums2, nums1));
        Set<Integer> set1 = new HashSet<>();
        Arrays.sort(nums1);
        for (int item:
             nums1) {
            int loc = Arrays.binarySearch(nums2,item);
            if(loc < 0){
                set1.add(item);
            }
        }
        Set<Integer> set2 = new HashSet<>();
        Arrays.sort(nums2);
        for (int item:
                nums2) {
            int loc = Arrays.binarySearch(nums1,item);
            if(loc < 0){
                set2.add(item);
            }
        }
        return Arrays.asList(set1.stream().toList(), set2.stream().toList());
    }
}
