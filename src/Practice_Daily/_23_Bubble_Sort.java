package Practice_Daily;

import java.util.Arrays;

public class _23_Bubble_Sort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1};
        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
