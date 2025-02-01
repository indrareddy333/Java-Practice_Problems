package Practice_Daily;

import java.util.Arrays;

public class _26_CycleSort {
    public static void main(String[] args) {
        int[] nums = {1,5,4,3,2};
        for(int i = 0 ; i < nums.length;i++){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
