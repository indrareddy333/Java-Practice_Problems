public class TolinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8};
        System.out.println(linearSearch(nums, 2));
    }
    public static int linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length;i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }

}
