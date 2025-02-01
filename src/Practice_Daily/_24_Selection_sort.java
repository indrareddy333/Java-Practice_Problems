package Practice_Daily;

import java.util.Arrays;

public class _24_Selection_sort {
    public static void main(String[] args) {
        int[] nums = {-1,23,4,45};
        for(int i = 0; i<nums.length; i++){
            int max = i;
            for(int j = i+1; j<nums.length;j++){
                if(nums[max]>nums[j]){
                    max = j;
                }
            }
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
