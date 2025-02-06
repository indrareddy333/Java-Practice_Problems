package Practice_Daily;

import java.util.Arrays;
//4,0,1,1,3
//2,1,0,3

public class _38_FindSmalllestNumbersINarray {
    public static void main(String[] args) {
        int[] nums = {6,3,7,6,9};
        //1,0,3,1,4
        System.out.println(Arrays.toString(smallestNUmber(nums)));
    }
    public static int[] smallestNUmber(int[] nums){
        int[] count = new int[101];
        int[] res = new int[nums.length];
        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 1 ; i <= 100; i++) {
            count[i] = count[i] + count[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }
        return res;
    }

}
