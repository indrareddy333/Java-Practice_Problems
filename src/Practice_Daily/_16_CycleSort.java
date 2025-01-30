package Practice_Daily;

import java.util.Arrays;

public class _16_CycleSort {
    public static void main(String[] args) {
        int[] nums = {4,3,1,2};
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
