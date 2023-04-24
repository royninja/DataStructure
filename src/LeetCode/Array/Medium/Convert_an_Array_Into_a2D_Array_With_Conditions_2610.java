package LeetCode.Array.Medium;

import java.util.*;
/*
https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/
https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/solutions/3369344/java-simple-solution-using-hashmap/?orderBy=most_votes&languageTags=java
needed to check hasmhmap, treeset, hashset, set
 */
public class Convert_an_Array_Into_a2D_Array_With_Conditions_2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
            hashSet.add(num);
        }
        List<List<Integer>> finalList = new ArrayList<>();

        while (hashMap.size() != 0){
            List<Integer> list = new ArrayList<>();

            for (int item: hashSet) {
                if(hashMap.containsKey(item)){
                    int count = hashMap.get(item);
                    list.add(item);
                    if(count == 1){
                        hashMap.remove(item);
                    }else{
                        hashMap.put(item, count - 1);
                    }
                }
            }
            finalList.add(list);
        }
        return finalList;
    }
}
