package Practice_Daily;

import java.util.Arrays;

public class _102_ShuffleCharcters {
    public static void main(String[] args) {
        //Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        //Output: "leetcode"
        //Explanation: As shown, "codeleet" becomes "leetcode" after shuffling
        String name = "codeleet";
        int[] ind = {4,5,6,7,0,2,1,3};
        char[] result = new char[name.length()];
        for (int i = 0; i < result.length; i++) {
            result[ind[i]] = name.charAt(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
