package Practice_Daily;

import java.util.Arrays;

public class _95_BubbleSort {
    public static void main(String[] args) {
        int[] nums = {2,1,3,8,5,4};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
