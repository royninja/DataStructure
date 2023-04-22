package LeetCode.Array.Medium;

public class Solution1828 {
    protected  int[] answer;
    public int[] countPoints(int[][] points, int[][] queries) {
        answer = new int[queries.length];
        for(int i = 0 ; i < queries.length; i++){
            int count = 0;
            for (int j = 0; j < points.length; j++){
                double squareX = Math.pow((queries[i][0] - points[j][0]),2);
                double squareY = Math.pow((queries[i][1] - points[j][1]),2);
                double expected = Math.sqrt(squareX+squareY);
                if(expected <= queries[i][2]){
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
