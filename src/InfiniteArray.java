public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int target = 12;
        System.out.println(forRange(nums,target));
    }
    public static int forRange(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(nums[end]<target){
            int newstart = end+1;
            end = end + (end-start+1)*2;
            start = newstart;
        }
        return binarysearch(nums,target,start,end);
    }

    public static int binarysearch(int[] nums,int target, int start ,int end){
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
