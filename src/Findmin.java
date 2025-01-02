public class Findmin {
    public static void main(String[] args){
        int[] nums = {2,1,5,6,7,8,23,45,12,-1};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums){
        int min = nums[0];

        for(int i = 0; i<nums.length; i++){
            if(min>nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
}
