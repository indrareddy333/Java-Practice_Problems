package Practice_Daily;

import java.util.Arrays;

public class _11_SlectionSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean step = false;
        for (int i = nums.length-1; i >= 0; i--) {
            int max = 0;
            for (int j = 0; j <=i; j++) {
                if (nums[max] < nums[j]){
                    max = j;
                }
            }
            if(max != i) {
                int temp = nums[max];
                nums[max] = nums[i];
                nums[i] = temp;
                step = true;
            }
            if(!step){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
