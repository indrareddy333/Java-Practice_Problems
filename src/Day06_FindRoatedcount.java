public class Day06_FindRoatedcount {
    public static void main(String[] args) {
        int[] nums = {4,5,6,8,1,2,3};
        System.out.println("The array rotated : "+(rotateCount(nums)+1)+" times");
    }
    public static int rotateCount(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]>nums[end] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid]<nums[start] && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]<nums[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

}
