package Algorithms.EasyAlgo;

public class KadanesAlgorithm {
    public int Kadaens(int arr[]){
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;

        for (int item:arr) {
            max_ending_here = max_ending_here + item;
            if(max_ending_here > max_so_far){
                max_so_far = max_ending_here;
            }
            if(max_so_far < 0){
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
