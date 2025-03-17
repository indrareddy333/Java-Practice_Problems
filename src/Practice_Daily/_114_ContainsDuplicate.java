package Practice_Daily;

public class _114_ContainsDuplicate {
    public static void main(String[] args) {
        //Input: nums = [1,2,3,1]
        //
        //Output: true
        //
        //Explanation:
        //
        //The element 1 occurs at the indices 0 and 3.
        int[] nums = {-1,2,3,4,-1, 1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        int[] prefix = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                prefix[nums[i]]++;
            }
            else{
                prefix[nums[i]*-1]++;
            }
        }
        for (int i = 0; i < prefix.length; i++) {
            if(prefix[i] > 1){
                return true;
            }
        }
        return false;
    }
}
