package Practice_Daily;

public class _76_Recursion {
    public static void main(String[] args) {
        counting(1);
    }
    public static void counting(int num){
        if(num == 3){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        counting(num+1);
    }
}
