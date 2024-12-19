public class MaxValue {
    public static void main(String[] args) {
        int[] array = {100,3,4,6,89,77,99,7,8,9};
        System.out.println(arrayMax(array));

    }
    public static int arrayMax(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return arr[max];
    }

}
