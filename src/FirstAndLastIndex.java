import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,7,7,7};
        int target = 8;
        firstAndLast(nums,target);
    }
    public static void firstAndLast(int[] nums, int target){
        int[] array = new int[2];
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        array[0] = start;
        array[1] = end;
        System.out.println(Arrays.toString(array));
    }
    static int search(int[] num, int target, boolean firstindex){
        int ans = -1;
        int start = 0;
        int end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(target>num[mid]){
                start = mid+1;
            }else if(target<num[mid]){
                end = mid-1;
            }
            else{
                ans = mid;
                if(firstindex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }


}
