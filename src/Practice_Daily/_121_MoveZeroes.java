package Practice_Daily;

import java.util.Arrays;

public class _121_MoveZeroes {
    public static void main(String[] args) {
        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int[] arrays = new int[nums.length];
        int i = 0;
        int j = 0;
        while(i < nums.length){
            if(nums[i]!=0){
                arrays[j] = nums[i];
                j++;
            }
            i++;
        }
        for (int k = 0; k < nums.length; k++) {
            nums[k] = arrays[k];
        }
        System.out.println(Arrays.toString(nums));
    }
}
