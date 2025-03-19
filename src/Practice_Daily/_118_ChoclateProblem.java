package Practice_Daily;

import java.util.Arrays;

//Input: arr = [3, 4, 1, 9, 56, 7, 9, 12], m = 5
//Output: 6
public class _118_ChoclateProblem {
    public static void main(String[] args) {
        int[] arr = {12, 8 ,13, 10, 7 ,11, 12 ,12, 6, 13};
        int m = 2;
        System.out.println(findMinDiff(arr,m));
    }
    public static int findMinDiff(int[] arr, int m) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int sub = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(i+m-1 < arr.length){
                if(arr[i+m-1]-arr[i]<sub){
                    sub = arr[i+m-1]-arr[i];
                }
            }
        }
        return sub;
    }
}
