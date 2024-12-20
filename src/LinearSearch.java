public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};
        System.out.println("The index of searched item is = " + Linear(arr,7));
    }
    public static int Linear(int[] arr, int search){
        int index = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i] == search){
                index = i;
            }
        }
        return index;
    }

}
