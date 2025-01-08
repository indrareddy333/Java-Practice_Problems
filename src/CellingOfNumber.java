public class CellingOfNumber {
    //Celling of a number
    // Find the smallest element in array greater or equal to number;
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,23,34};
        int target = 25;
        System.out.println(binarySearch(nums,target));
    }
    public static int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        //printing a smallest element in array  number;
        return start;
    }
}
