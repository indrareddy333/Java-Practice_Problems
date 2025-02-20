package Practice_Daily;

public class _77_Recursion {
    public static void main(String[] args) {
        EvenNUmbers(1);
    }
    public static void EvenNUmbers(int num){
        if(num == 10){
            return;
        }
        if(num%2==0){
            System.out.println(num);
        }
        EvenNUmbers(num+1);
    }
}
