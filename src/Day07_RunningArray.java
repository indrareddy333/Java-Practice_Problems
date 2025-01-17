import java.util.Arrays;

public class Day07_RunningArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningArray(nums)));
    }
    public static int[] runningArray(int[] nums){
        int num = 0;
        int[] array = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            num = num + nums[i];
            array[i] = num;
        }
        return array;
    }

}
