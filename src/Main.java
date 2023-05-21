import LeetCode.Array.Medium.Solution2215;
import LeetCode.Array.Medium.Solution2545;
import LeetCode.Array.Medium.SpiralMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SpiralMatrix sp = new SpiralMatrix();
        List<Integer> ans = sp.spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
        for (int item:
             ans) {
            System.out.print(item+" ");
        }
    }
}