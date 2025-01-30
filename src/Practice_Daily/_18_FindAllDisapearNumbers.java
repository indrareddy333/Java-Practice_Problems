package Practice_Daily;

import java.util.ArrayList;
import java.util.List;

public class _18_FindAllDisapearNumbers {
    public static void main(String[] args) {
        int[] nums = {4,3,2,1,7,8,2,3};
        System.out.println((MissingNUmber(nums)));
    }
    public static List<Integer> MissingNUmber(int[] nums){
        List<Integer> array = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<nums.length;j++){
            if(nums[j]!=(j+1)){
                array.add(nums[j]);
            }
        }
        return array;
    }
}
