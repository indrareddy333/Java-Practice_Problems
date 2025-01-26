package Practice_Daily;

import java.util.Arrays;

public class _07_CreateTargetElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] target = {0,1,2,3,0};
        System.out.println(Arrays.toString(createTargetArray(nums,target)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        for(int i = 0; i<nums.length;i++){
            if(i != index[i]){
                int num = i;
                while(index[i] < num){
                    int temp = nums[num];
                    nums[num] = nums[num-1];
                    nums[num-1] = temp;
                    num--;
                }
            }
        }
    return nums;
    }
}
