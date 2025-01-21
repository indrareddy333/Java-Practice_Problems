import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day09_KidsGretestNumber {
    //1431. Kids With the Greatest Number of Candies
    public static void main(String[] args) {
        int[] nums = {12,1,12}; int extracandies = 10;
        System.out.println(Kids(nums, extracandies));
    }
    public static List<Boolean> Kids(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int maxcandy = 0;
        for(int i = 0; i<candies.length;i++) {
            candies[i] = candies[i] + extraCandies;
            if (maxcandy < candies[i]) {
                maxcandy = candies[i];
            }
        }
        for(int num : candies) {
            if(num + extraCandies >= maxcandy) {
                result.add(true);
            }
            else {
                result.add(false);
            }

        }
        return result;
    }

}
