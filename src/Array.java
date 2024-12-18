import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println(Arrays.toString(arr));
    }
}
