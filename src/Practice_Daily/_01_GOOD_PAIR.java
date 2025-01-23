package Practice_Daily;

public class _01_GOOD_PAIR {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(goodPairs(nums));
    }
    public static int goodPairs (int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length-1;i++){
            int j = i+1;
            while(j < nums.length){
                if(nums[i] == nums[j]){
                    count++;
                }
                j++;
            }
        }
    return count;
    }
}

