package Practice_Daily;

import java.util.Arrays;

public class _119_CycleSort {
    public static void main(String[] args) {
        int[] array = {2,1,3,4,5};
        int i = 0;
        while(i < array.length){
            if(i+1 != array[i]){
                int temp = array[array[i]-1];
                array[array[i]-1] = array[i];
                array[i] = temp;
            }
            if(i+1 == array[i]){
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
