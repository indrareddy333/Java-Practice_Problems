package Practice_Daily;

import java.util.Arrays;

public class _22_SetMissing {
    public static void main(String[] args) {
       int[] nums = {8,7,3,5,3,6,1,4};
        System.out.println(Arrays.toString(setnumber(nums)));
    }
    public static int[] setnumber(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j]!=j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }
}
