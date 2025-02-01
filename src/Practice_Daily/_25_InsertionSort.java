package Practice_Daily;

import java.util.Arrays;

public class _25_InsertionSort {
    public static void main(String[] args) {
        int[] nums = {-1,3,4,2};
        for(int i = 1; i<nums.length;i++){
            for(int j = i; j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
