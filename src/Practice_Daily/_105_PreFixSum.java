package Practice_Daily;

import java.util.Arrays;

public class _105_PreFixSum {
    //Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
    //Output: 1960
    //Explanation:
    //The maximum population is 2, and it had happened in years 1960 and 1970.
    //The earlier year between them is 1960.
    public static void main(String[] args) {
        int[][] log = {{1950,1961},{1960,1971},{1970, 1981}};
        System.out.println(maximumPopulation(log));
        // example main Main();
    }
    public static int maximumPopulation(int[][] logs) {
        int[] year = new int[2050];

        for(int[] log : logs){
            year[log[0]] = 1;
            year[log[1]] = -1;
        }
        int maxnum = year[1950], maxyear = 1950;
        for (int i = 1951; i < year.length; i++) {
            year[i] = year[i] + year[i-1];
            if(year[i]>maxnum){
                maxnum = year[i];
                maxyear = i;
            }
        }
        return maxyear;
    }
    public static void Main(){
        int[] num = {0,1,2,3,2,5};
        int[] sum = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            sum[num[i]] -= 1;
        }

        System.out.println(Arrays.toString(sum));
    }
}
