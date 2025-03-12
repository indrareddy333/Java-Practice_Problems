package Practice_Daily;

public class _109_MaxAndMinProbelms {
    //Input: arr[] = [3, 2, 1, 56, 10000, 167]
    //Output: 1 10000
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 56, 10000, 167};
        maxAndMin(array);
    }
    public static void maxAndMin(int[] arr){
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        System.out.println(arr[min] + ", " +arr[max]);
    }
}
