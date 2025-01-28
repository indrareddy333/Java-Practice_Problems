package Practice_Daily;
import java.util.Arrays;
public class _12_InsertionSort {
    public static void main(String[] args) {
        int[] nums = {80,30,70,20,10,60,50,40};
        for(int i = 0; i<nums.length-1; i++){
            for(int j = i+1; j>0; j--){
                boolean step = false;
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    step = true;
                }
                if(!step){
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
