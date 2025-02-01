package Practice_Daily;

import java.util.Arrays;

public class _27_FirstMissingPostive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(MissingNUmber(nums));
    }
        public static int MissingNUmber(int[] nums){
            int i = 0;
            while(i < nums.length){
                int correct = nums[i]-1;
                if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                    int temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
                }
                else{
                    i++;
                }
            }
            for(int j = 0; j<nums.length;j++){
                if(nums[j]!=j+1){
                    return j+1;
                }
            }
            return nums.length+1;
    }

}
