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

    public void KadaensWithRange(int arr[]){
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int s = 0;

        for(int i = 0; i < arr.length; i++){
            max_ending_here += arr[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if(max_ending_here < 0) {
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println("starting index: "+start);
        System.out.println("ending index: "+end);
    }
}
