package Practice_Daily;

import java.util.Arrays;

public class _123_missingnumbers {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(MissingNUmber(nums));
    }
    public static int MissingNUmber(int[] nums){
        int i = 0;
        while(i < nums.length){
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]){
                int temp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j = 0; j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
}
