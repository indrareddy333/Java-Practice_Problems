package Practice_Daily;

import java.util.Arrays;

public class _Day_02_SmallestNumbers {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        // output = 2,1,0,3
        System.out.println((Arrays.toString(smallerNumbersThanCurrent(nums))));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = 0; j< nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            array[i] = count;
        }
        return array;
    }
}
