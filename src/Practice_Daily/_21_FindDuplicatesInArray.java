package Practice_Daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _21_FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(DuplicateNumbers(nums));
    }
    public static List<Integer> DuplicateNumbers(int[] nums) {
        List<Integer> newlist = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                    int temp = nums[correct];
                    nums[correct] = nums[i];
                    nums[i] = temp;
            } else {
                i++;
            }
        }
        for(int j = nums.length-1; j>= 0; j--){
            if(nums[j]!=j+1){
                newlist.add(nums[j]);
            }
        }
        return newlist;
    }
}
