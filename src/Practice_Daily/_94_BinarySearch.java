package Practice_Daily;

public class _94_BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        int target = 6;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid]==target){
                System.out.println(nums[mid]);
            }

            if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

    }
}
