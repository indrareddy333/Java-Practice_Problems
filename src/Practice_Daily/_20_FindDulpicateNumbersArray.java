package Practice_Daily;

public class _20_FindDulpicateNumbersArray {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4,1};
        System.out.println(DuplicateNumbers(nums));
    }
    public static int DuplicateNumbers(int[] nums){
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    int temp = nums[i];
                    nums[i] =nums[correct];
                    nums[correct] = temp;
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
