import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {6,7,3,1,9,8,9,5,6,33};
        selctionSort(nums);
    }
    public static void selctionSort(int[] nums){
        int min = 0;
        int temp;
        for(int i = 0; i<nums.length-1;i++){
            min = i;
          for(int j = i+1; j<nums.length;j++){
              if(nums[min]>nums[j]){
                  min = j;
              }
          }
          temp  =  nums[min];
          nums[min] = nums[i];
          nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));


    }
}
