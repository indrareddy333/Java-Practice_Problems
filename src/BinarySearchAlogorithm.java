public class BinarySearchAlogorithm {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int target = 79;
        int result =  isBinarySearch(nums, target);
        System.out.println(result);
    }

    public static int isBinarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(target>nums[mid]){
                start = mid+1;
            }else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
