package Practice_Daily;

import java.util.Arrays;

public class _90_MergeToArrays {
    public static void main(String[] args) {
       //Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
        //Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

        int[] nums = {1, 3, 4, 5};
        int[] nums1 = {2, 4, 6, 8};
        System.out.println(Arrays.toString(MergeFunction(nums, nums1)));
    }
    public static int[] MergeFunction(int[] nums, int[] nums1){
        int[] nums3 = new int[nums.length+nums.length];
        for (int i = 0; i < nums3.length/2; i++) {
            nums3[i] = nums[i];
            nums3[i+nums.length] = nums1[i];
        }
        Arrays.sort(nums3);
        return nums3;
    }
}
