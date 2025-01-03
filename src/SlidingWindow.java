public class SlidingWindow {
    public static void main(String[] args) {
        int[] nums = {10, 1, 4, 1, 9, 1, 2,45,9};
        slidingWindow(nums);
    }

    public static void slidingWindow(int[] nums) {
        int num2 = 0;
        int start = 0;
        int end = 3;
        int i = 0;
        while (i < nums.length && end != nums.length){
            int num = 0;
            for (int j = start; j < end+1; j++) {
                num = num + nums[j];
            }
            start = start + 1;
            end = end + 1;
            if(num > num2){
                num2 = num;
            }
            i++;
        }
        System.out.println(num2);
    }

}
