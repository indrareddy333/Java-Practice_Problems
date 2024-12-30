public class BinarySearchRecurssion {
    public static void main(String[] args) {
        int[] nums = {4,5,6};
        int target = 0;
        System.out.println(binarySearch(nums,target,0,nums.length-1));
    }
    public static int binarySearch(int[] nums, int target, int start,int end){
        if(start <= end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid] > target){
                return binarySearch(nums, target, start,mid-1);
            }
            else{
                return binarySearch(nums, target, mid+1,end);
            }
        }
        return -1;
    }
}
