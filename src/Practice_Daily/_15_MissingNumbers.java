package Practice_Daily;

import java.util.Arrays;

public class _15_MissingNumbers {
    public static void main(String[] args) {
        int [] array = {4,0,2,1,3};
        System.out.println(missingNUmber(array));
    }
    public static int missingNUmber(int[] array) {
        int i = 0;
        while (i < array.length){
            if (array[i] < array.length && array[i] != array[array[i]]) {
                int temp = array[array[i]];
                array[array[i]] = array[i];
                array[i] = temp;
            }
            else{
                i++;
            }
        }
        for(int j = 0; j<array.length;j++){
            if(array[j]!=j){
                return j;
            }
        }
        return array.length;
    }
}
