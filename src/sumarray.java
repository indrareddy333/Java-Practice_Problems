//https://leetcode.com/problems/two-sum/submissions/1491632452/


public class sumarray {
    public static void main(String[] args) {
        int[] array = {2,7,11,15};
        int target = 9;
        int[] array1 = twoSum(array, target);
        for (int j : array1) {
            System.out.println(j);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        int i = 0;
        while (nums.length - 1 >= i) {
            boolean bin = false;
            int num = 1;
            int num1 = 1;
            if(nums.length >= 5){
                num1 = 2;
            }
            while(nums.length-num1 >= num){
                if((nums[i]+nums[i+num]) == target){
                    array[0] = i;
                    array[1] = i+num;
                    bin = true;
                    break;
                }
                num++;
            }
            if(bin){
                break;
            }
            else{
                i++;
            }

        }
        return array;
    }

}

