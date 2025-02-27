package Practice_Daily;

public class _86_EvenOddNumbersDigits {
    //Input: nums = [12,345,2,6,7896]
    //Output: 2
    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if((int)(Math.log10(nums[i])+1) % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
}
