public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,9};
        for (int i = arr.length-1; i >= 0; --i){
            System.out.print(arr[i]+", ");
        }
    }
}
