package Practice_Daily;

import java.util.Arrays;

public class _10_BubbleSortPractice01 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        boolean step = false;
        for(int i = 0; i<nums.length-1 ; i++){
            for(int j = i+1 ; j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    step = true;
                }
            }
            if(!step){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
