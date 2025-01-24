package Practice_Daily;

import java.util.Arrays;

public class _03_RowColMatrix {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        int target = 8;
        System.out.println(Arrays.toString(rowColMtatrix(nums, target)));
    }
    public static int[] rowColMtatrix(int[][] nums, int target){
        int row = 0;
        int col = nums[row].length-1;
        while(row < nums.length){
            if(nums[row][0] <= target && nums[row][col]>= target){
                int binary = binarysearch(nums[row], target);
                if(binary != -1){
                    return new int[]{row, binary};
                }
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }

    public static int binarysearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                start = mid+1;
            }
            if(target < nums[mid]){
                end = end-1;
            }
        }
        return -1;
    }
}
