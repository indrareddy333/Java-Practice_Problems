package Practice_Daily;

import java.util.ArrayList;
import java.util.Arrays;

public class _70_Problems_part4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 10, 20, 30, 30, 30, 30, 8};
        frequancy(nums);
    }
    //Finding the frequency of elements in an array
    //10, 20, 10, 10, 20, 30, 30, 30, 30, 0
    static void frequancy(int[] nums){
        int[] freq = new int[nums.length];
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> frequancy = new ArrayList<>();
        int visited = -1;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i]!=visited){
                freq[i] = count;
            }
        }
        for (int num = 0; num < nums.length; num++) {
            if(freq[num]!=visited){
                int numarray = nums[num];
                array.add(numarray);
                int numfreq = freq[num];
                frequancy.add(numfreq);
            }
        }

        System.out.println(array.toString());
        System.out.println(frequancy.toString());
    }
}
