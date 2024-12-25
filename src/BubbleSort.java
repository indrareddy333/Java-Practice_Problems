import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3,1,4,5,9,10,1};
        System.out.println(Arrays.toString(bubblesort(array)));

    }
    public static int[] bubblesort(int[] array){
        int start = 0;
        int end = array.length-1;
        while(start != end){
            for(int i = 0; i < array.length-1 ; i++){
                if(array[i]>array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            end = end-1;
        }
        return array;
    }
}
