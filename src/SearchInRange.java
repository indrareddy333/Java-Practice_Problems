public class SearchInRange {
    public static void main(String[] args){
        int[] nums = {3,5,6,7,5,32,66,34};
        System.out.println(searchInRange(nums,5,2,4));
    }
    public static int searchInRange(int[] nums, int target, int start, int end){
        for(int i = start; i<end;i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
