import java.util.Arrays;

public class SearchMountainArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,3,2,1};
        int target = 2;
        int peak = mountainArray(nums);
        int asc = binarySearch(nums,target,0,peak);
        int dsc = binarySearch(nums,target,peak,nums.length-1);
        int[] nums1 = {asc,dsc};
        System.out.println(Arrays.toString(nums1));
    }
    public static int mountainArray(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else if(nums[mid] <= nums[mid + 1]) {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int binarySearch(int[] nums, int target,int start,int end){
        boolean isAsc = nums[start] < nums[end];
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target) {
                return mid;
            }

            if(isAsc) {
                if(target>nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else {
                if(target<nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
