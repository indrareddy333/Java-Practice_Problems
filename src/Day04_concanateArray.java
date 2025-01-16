import java.util.Arrays;

public class Day04_concanateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(newmethod(nums)));
        int[] array = new int[nums.length*2];
        int newcount = 0;
        while(newcount <= array.length-1){
            for(int i = 0; i<1;i++){
                for(int j = 0; j < nums.length;j++){
                    array[newcount] = nums[j];
                    newcount++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] newmethod(int[] nums){
        int n = nums.length;
        int[] array = new int[2*n];
        for(int i = 0; i<n;i++){
            array[i] = nums[i];
            array[i+n] = nums[i];
        }
        return array;
    }

}
