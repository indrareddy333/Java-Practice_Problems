public class mountainArray {
    public static void main(String[] args){
        int[] nums = {1,3,5,4,2,0};
        System.out.println( mountainArray(nums));
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
}
