package Practice_Daily;

import java.util.Arrays;
import java.util.ArrayList;

public class _39_ArrangeThroughIndex {
    public static void main(String[] args) {
        //Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
        //Output: [0,1,2,3,4]
        int[] nums = {1,2,3,4,0};
        int[] nums1 = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        //Output: [0,4,1,3,2]
        arrangeIndex(nums, index);
        System.out.println(Arrays.toString(createTargetArray(nums1, index)));
    }
    public static void arrangeIndex(int[] nums, int[] index){
        for(int i = 0; i<nums.length;i++){
            if(i != index[i]){
                for(int j = i; j>index[i];j--){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            target.add(index[i],nums[i]);
            System.out.println(target);
        }
        System.out.println(target);
        int [] result =new int [target.size()];
        for (int i=0; i<target.size(); i++){
            result[i] =target.get(i);
        }
        return result;
    }
}
