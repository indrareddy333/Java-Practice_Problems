package Practice_Daily;

import java.util.Arrays;

public class _69_ProblemsPart3 {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 1, 10, 30, 40, 20};
        //LargestArray(array);
        //numberarrays(array);
        sorting(array);
    }
    // finding the largest element of the array
    static void LargestArray(int[] array){
        int max = 0;
        int min = 0;
        int secondmin = 0;
        int secondlar = 0;
        for (int i = 1; i < array.length; i++) {
                if(array[min] > array[i]){
                    min = i;
                }else if(array[max]<array[i]){
                    max = i;
                }
        }
        for (int small = 1; small < array.length; small++) {
            if(array[min]!=array[small] && array[secondmin] > array[small]){
                secondmin = small;
            }else if(array[max]!=array[small] && array[secondlar] < array[small]){
                secondlar = small;
            }
        }
        //System.out.println(array[secondmin]);
        //Calculate the sum of elements in an array
        int total = 0;
        for (int sum = 0; sum < array.length; sum++) {
            total = total + array[sum];
        }
        //System.out.println(total);
        //Reverse an Array
        int[] nums = new int[array.length];
        for (int rev = array.length-1; rev >= 0; rev--) {
            nums[(array.length-1) - rev] = array[rev];
        }

    }
    static void numberarrays(int[] number){
        //Sort first half in ascending order and second half in descending
        // 1, 90, 34, 89, 7, 9
        int half = number.length/2;
        for (int num = 0; num < number.length-1; num++) {
            for (int i = 0; i < number.length / 2; i++) {
                if (number[i] > number[i+1]){
                    int temp = number[i];
                    number[i] = number[i + 1];
                    number[i + 1] = temp;
                }
                for (int j = half; j < number.length - 1; j++) {
                    if (number[j] < number[j+1]) {
                        int temp = number[j];
                        number[j] = number[j + 1];
                        number[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
    //1, 90, 34, 89, 7, 9
    static void sorting(int[] nums){
        int number = 0;
        while(number < nums.length) {
            for (int i = number+1 ; i < nums.length; i++) {
                if (nums[number] > nums[i]) {
                    int temp = nums[number];
                    nums[number] = nums[i];
                    nums[i] = temp;
                }
            }
            number++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
