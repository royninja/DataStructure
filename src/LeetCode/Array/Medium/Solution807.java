package LeetCode.Array.Medium;

//https://leetcode.com/problems/max-increase-to-keep-city-skyline
//best solution link https://leetcode.com/problems/max-increase-to-keep-city-skyline/solutions/3021144/java-solution-beats-100/?orderBy=most_votes&languageTags=java
/*solved using the editorial*/
/* skyline is the outer line of the city, like here max of row and col are the skyline
any building can't be taller than that
 */
public class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] rowMax = new int[n]; //skyline for east and west
        int[] columnMax = new int[n]; //skyline for north and south

        //finding the maximum of row and column
        for(int r = 0; r < n; r++){
            for (int c = 0; c < n; c++) {
                rowMax[r] = Math.max(rowMax[r],grid[r][c]);
                columnMax[c] = Math.max(columnMax[c], grid[r][c]);
            }
        }

        //finding the difference ( we need to maintain the maximum height of the row_max and column_max
        // and have to compare with grid and minimum of row_max and column_max
        // )and adding the difference to the sum
        int ans = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                ans += Math.min(rowMax[r], columnMax[c]) - grid[r][c];
            }
        }
        return ans;
    }
}
