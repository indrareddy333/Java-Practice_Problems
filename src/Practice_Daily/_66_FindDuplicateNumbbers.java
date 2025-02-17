package Practice_Daily;


import java.util.Arrays;

public class _66_FindDuplicateNumbbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,2,3,1};
        int[] freq = new int[arr.length];
        int visted = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    freq[j] = visted;
                }
                if(freq[i] != visted){
                    freq[i] = count;
                }
            }
            System.out.println(Arrays.toString(freq));
        }
    }
}
