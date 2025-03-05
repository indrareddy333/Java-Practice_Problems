package Practice_Daily;

import java.util.Arrays;

//Calculate the sum of elements in an array
public class _98_PracticingPrograms {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        //System.out.println(sum);

        int[] array = {10, 30, 10, 20, 10, 20, 30, 10};
        int[] n = new int[array.length];

        int count = 1;
        for(int i = 0; i< array.length; i++){
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    count++;
                    n[j] = -1;
                }
            }
            if(n[i]!=-1){
                n[i] = count;
            }
            count = 1;
        }
        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            if(n[i] != -1){
                System.out.println(array[i] + " = " + n[i]);
            }
        }
    }
}
