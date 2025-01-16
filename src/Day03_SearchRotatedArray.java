
public class Day03_SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,8,9,0,1,2};
        System.out.println(searchRotatedarray(nums, 9));
        System.out.println(pivot(nums));
    }
    public static int searchRotatedarray(int[] nums, int target){
        int pivot = pivot(nums);
        int firstasc = BinarySearch(nums,target,0, pivot);
        if(pivot == target){
            return pivot;
        }
        if(firstasc!=-1){
            return firstasc;
        }
        return BinarySearch(nums, target, pivot+1, nums.length);
    }
    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int mid = (start+end)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(start <= mid){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static int BinarySearch(int[] nums, int target, int start, int end){
        while(start<= end){
            int mid = (start+end)/2;
            if(nums[mid] < target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
