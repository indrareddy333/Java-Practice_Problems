package Practice_Daily;

public class _78_Fibonaci_Recursion {
    public static void main(String[] args) {
        System.out.println(fibonaciNum(7));
    }
    public static int fibonaciNum(int nth){
         if(nth<2){
             return nth;
         }
         return fibonaciNum(nth-1) + fibonaciNum(nth-2);
    }
}
