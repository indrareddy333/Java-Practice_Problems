public class DAY01_PeakMountainArray {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(peakMountainArray(nums));
    }
    static int peakMountainArray(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
}
