package Practice_Daily;

import java.util.Arrays;

public class _13_InsertionSortP1 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,3,2,10,1};
        for(int i = 0; i<nums.length-1;i++){
            boolean swap = false;
            for(int j = i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swap = true;
                }
                if(!swap){
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
    }
}
