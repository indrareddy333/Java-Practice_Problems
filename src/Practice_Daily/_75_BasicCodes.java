package Practice_Daily;
import java.util.*;
public class _75_BasicCodes {
    public static void main(String[] args) {
        int[] nums = {10,20,10,20,30,40};
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            list.add(nums[i]);
        }
        //System.out.println(set);
        //System.out.println(list);

        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29, 9};

        if (Disjoint(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean Disjoint(int arr1[], int arr2[])
    {
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
