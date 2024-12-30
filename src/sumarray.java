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
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

}

