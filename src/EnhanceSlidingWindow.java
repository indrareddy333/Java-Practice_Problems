public class EnhanceSlidingWindow {
    public static void main(String[] args) {
        int[] nums = {10, 1, 4, 1, 9, 1, 2,45,9};
        int k = 4;
       slidingWindow(nums,k);
    }
    public static void slidingWindow(int[] nums, int k){
        int wind_sum = 0;
        for(int i = 0; i < k; i++){
            wind_sum = wind_sum+nums[i];
        }
        int max_sum = 0;
        for(int j = k; j<nums.length;j++){
            wind_sum= wind_sum + nums[j]-nums[j-k];
            if(wind_sum > max_sum){
                max_sum = wind_sum;
            }
        }
        System.out.println(max_sum);
    }
}
