package Practice_Daily;

public class _120_RotatedSortedArray {
    public static void main(String[] args) {
    int[] nums = {3,5,1};
    int target = 3;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if(pivot == -1){
            return Binarysearch(nums,target,0, nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }
        if(target >= nums[0]){
            return Binarysearch(nums, target, 0,pivot-1);
        }
        return Binarysearch(nums,target,pivot+1, nums.length-1);
    }
    public static int Binarysearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = (start + end) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int pivot(int[] nums){
       int start = 0;
       int end = nums.length-1;
       while(start <= end){
           int mid = start + (end - start)/2;
           if(mid > start && nums[mid] < nums[mid-1]){
               return mid-1;
           }
           if(mid < end && nums[mid] > nums[mid+1]){
               return mid;
           }
           if(nums[mid] <= nums[start]){
               end = mid-1;
           }else{
               start = mid+1;
           }
       }
       return -1;
    }
}
