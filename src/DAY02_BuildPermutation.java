import java.util.Arrays;

public class DAY02_BuildPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4}; //0,1,2,4,5,3
        System.out.println(Arrays.toString(biuldPermutations(nums)));
    }

    static int[] biuldPermutations(int[] nums){
        int[] ans = new int[nums.length];
        for (int i = 0; i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
