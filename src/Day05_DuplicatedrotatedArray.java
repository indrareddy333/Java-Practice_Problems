public class Day05_DuplicatedrotatedArray {
    public static void main(String[] args) {
        int[] nums = {4,4,4,4,9,3,3,3};
        System.out.println(pivot(nums));
    }
    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<nums[end] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]>nums[start] && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]==nums[start] && nums[mid] == nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start]<nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

}
