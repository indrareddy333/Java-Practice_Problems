import java.util.Arrays;

public class Bubblesorting {
    public static void main(String[] args) {
        int[] nums = {2,3,1,-1,-2,-3,-4,7,8,9,10,0,6,7,7,8,9,9,9};
        bubbleSort(nums);
    }
    public static void bubbleSort(int[] nums){
        for(int i = 0; i<nums.length-1;i++){
            for(int j = i+1; j<nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


}
