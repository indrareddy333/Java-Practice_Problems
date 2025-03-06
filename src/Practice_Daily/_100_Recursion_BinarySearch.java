package Practice_Daily;

public class _100_Recursion_BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8};
        System.out.println(binarysearch(0, nums.length-1, nums,8));

    }
    public static int binarysearch(int start, int end, int[] nums, int target){
        int mid = (start + end)/2;
        if(target == nums[mid]){
            return mid;
        }
        if(target > nums[mid]){
            start = mid + 1;
        }else{
            end = mid -1;
        }
        if(start<=end){
            return binarysearch(start,end,nums,target);
        }
        return -1;
    }
}
