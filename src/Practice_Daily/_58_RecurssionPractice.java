package Practice_Daily;

public class _58_RecurssionPractice {
    public static void main(String[] args) {
        int n = 1;
        count(n);
    }
    static void count(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        count(n+1);
    }

}
