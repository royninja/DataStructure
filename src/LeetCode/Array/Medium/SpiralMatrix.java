package LeetCode.Array.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row =0 ; int col = 0;
        for (int i = 0; i <= matrix.length; i++) {
                ans.add(matrix[row][i]);
                col = i;
        }
        for (int i = col-1; i < matrix.length; i++) {
            ans.add(matrix[i][col]);
            row = i;
        }
        for (int i = col-1; i >=0 ; i--) {
            ans.add(matrix[row][i]);
        }
        row=row-1;
        col--;
        for (int i = 0; i <= col; i++) {
            ans.add(matrix[row][i]);
        }
        return ans;
    }
}
