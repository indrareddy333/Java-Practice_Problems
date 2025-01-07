public class OrderAgnostic {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 2;
        System.out.println(binarySearch(nums, target));
    }
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
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
    

