import java.util.Arrays;

public class Max_Min_2D_array {
    public static void main(String[] args) {
        int [][] nums = {{2,1,4},{44,5,7},{34,56,73}};
        System.out.println(Arrays.toString(SearchArray(nums)));
    }
    public static int[] SearchArray(int[][] nums){
        int min = nums[0][0];
        int max = nums[0][0];
        for(int i = 0; i< nums.length;i++){
            for(int j = 0; j < nums.length;j++){
                if(min > nums[i][j]){
                    min = nums[i][j];
                }
                else if(max<nums[i][j]){
                    max = nums[i][j];
                }
            }
        }
        return new int[] {min,max};
    }

}
