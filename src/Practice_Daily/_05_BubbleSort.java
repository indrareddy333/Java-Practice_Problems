package Practice_Daily;

import java.util.Arrays;

public class _05_BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,4,7,5,4,4,2,-4,-7};
        sort(nums);
    }
    public static void sort(int[] nums){
        int num = nums.length-1;
        boolean swap = false;
        while(0 < num){
            for(int i = 0; i < num ;i++) {
                if (nums[i] > nums[i + 1]) {
                    swap = true;
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            if(!swap){
                break;
            }
            num--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
