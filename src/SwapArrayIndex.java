import java.util.Arrays;

public class SwapArrayIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        ArraySwap(arr, 0, 5);
        System.out.println(Arrays.toString(arr));

    }
    public static void ArraySwap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }

}
