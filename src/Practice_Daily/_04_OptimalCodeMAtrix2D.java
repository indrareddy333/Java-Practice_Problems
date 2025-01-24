package Practice_Daily;

import java.util.Arrays;

public class _04_OptimalCodeMAtrix2D {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int target = 14;
        System.out.println(Arrays.toString(binarySearch2D(nums, target)));
    }
    public static int[] binarySearch2D(int[][] nums, int target){
        int start = 0;
        int end = nums[0].length-1;
        while(start < nums.length && end >= 0){
            if(nums[start][end] == target){
                return new int[]{start, end};
            }
            if(nums[start][end] > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
