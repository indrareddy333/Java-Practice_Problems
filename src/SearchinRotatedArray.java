public class SearchinRotatedArray {
    public static void main(String[] args) {
        int[] nums = {6,7,1,2,3,4,5};
        System.out.println(SearchRotatearray(nums,6));

    }
    public static int SearchRotatearray(int[] nums, int target){
        int pivot = pivot(nums);
        if(pivot == -1){
            return Binaryserach(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target){
            return pivot;
        }

        if(target >= nums[0]){
            return Binaryserach(nums,target,0,pivot-1);
        }
        return Binaryserach(nums,target,pivot+1,nums.length-1);

    }

    public static int Binaryserach(int[] nums, int target, int start,int end){
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
    public static int pivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
