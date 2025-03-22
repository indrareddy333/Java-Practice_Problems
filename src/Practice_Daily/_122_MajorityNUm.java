package Practice_Daily;

import java.util.Arrays;

public class _122_MajorityNUm {
    //Input: nums = [3,2,3]
    //Output: 3
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println( nums[n/2]);
    }
}
