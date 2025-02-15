package Practice_Daily;
//Example 1:
//Input: gain = [-5,1,5,0,-7]
//Output: 1
//Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

//Example 2:
//Input: gain = [-4,-3,-2,-1,4,3,2]
//Output: 0
//Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.

import java.util.ArrayList;
import java.util.Arrays;

public class _63_HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int[] array = new int[gain.length+1];
        for (int i = 1; i <= gain.length; i++) {
            array[i] = array[i-1] + (gain[i-1]);
        }
        int max = 0;
        for (int j = 0; j < array.length; j++) {
            if(array[max]<array[j]){
                max = j;
            }
        }
        return array[max];
    }

}
