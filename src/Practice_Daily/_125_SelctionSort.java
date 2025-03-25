package Practice_Daily;

import java.util.Arrays;

public class _125_SelctionSort {
    public static void main(String[] args) {
        int[] nums = {2,1,5,3,3,8,0};
        selctionSort(nums);
    }
    public static void selctionSort(int[] nums){
        int num  = nums.length-1;
        while(0 <= num){
            int max = 0;
            for(int i = 0; i<=num; i++){
                if(nums[i]>nums[max]){
                    max = i;
                }
            }
            int temp = nums[max];
            nums[max] = nums[num];
            nums[num] = temp;
            num--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
