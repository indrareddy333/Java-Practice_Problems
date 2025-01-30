package Practice_Daily;


public class _19_FindDuplicateNumbers {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(MissingNUmber(nums));
    }
    public static int MissingNUmber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<nums.length;j++){
            if(nums[j]!=(j+1)){
                return nums[j];
            }
        }
        return 0;
    }
}
