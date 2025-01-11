import java.util.Arrays;

public class SearchRotatedArray {
    public static void main(String[] args){
        int[] nums = {5,6,7,8,9,10,1,2,3,4};
        int target = 4;
        int large = pivot(nums);
        int asc1 = BinarySearch(nums,target,0,large);
        int asc2 = BinarySearch(nums,target,large-1,nums.length-1);
        if(asc1 == -1){
            System.out.println(asc2);
        }
        else{
            System.out.println(asc1);
        }
    }
    public static int pivot(int[] nums){
        int large = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[large] < nums[i]){
                large = i;
            }
        }
        return large;
    }
    public static int BinarySearch(int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = (start+end)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


}
