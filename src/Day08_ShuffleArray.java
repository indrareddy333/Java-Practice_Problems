import java.util.Arrays;

public class Day08_ShuffleArray {
    public static void main(String[] args) {
        //Input: nums = [1,2,3,4,4,3,2,1], n = 4
        //Output: [1,4,2,3,3,2,4,1]
        int[] nums = {1,2,3,4,4,3,2,1};
        int n = 4;
        long startTime = System.nanoTime();
        System.out.println(Arrays.toString(shuffle(nums,n)));
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time: " + duration/1e+6 + " milli second");
        System.out.println("Execution time: " + duration + " nano second");
        long startTime1 = System.nanoTime();
        System.out.println(Arrays.toString(optimizedShuffle(nums,n)));
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Execution time: " + duration1/1e+6 + " milli second");
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] Array = new int[nums.length];
        int num = 0;
        while(num < nums.length){
            if(num>1 && num % 2 ==0){
                Array[num] = nums[num/2];
                num++;
                Array[num] = nums[(num/2)+n];
            }else{
                Array[num] = nums[num];
                num++;
                Array[num] = nums[(num-1)+n];
            }
            num++;
        }
        return Array;
    }
    public static int[] optimizedShuffle(int[] nums, int n){
        int[] Array = new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++) {
            Array[k]=nums[i];
            Array[k+1]=nums[i+n];
            k=k+2;
        }
        return Array;
    }
}




