package Practice_Daily;

public class _96_Recurrsion {
    public static void main(String[] args) {
        //message(1);
        //Number(1);
        NumberPrimes(2, 20);
        //NumberPrimes1(4);
    }
    public static void message(int n){
        if(n<=6){
            return;
        }
        System.out.println("hello world");
        message(n+1);
    }
    public static void Number(int n){
        if(n>=6){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Number(n+1);
    }

    public static void NumberPrimes(int prime, int n){
        if(prime == n){
            return;
        }
        boolean bool = true;
        for (int i = 2; i <= prime/2; i++) {
            if(prime%2 ==0){
                bool = false;
                break;
            }
        }
        if (bool){
            System.out.println(prime);
        }

        NumberPrimes(prime+1, n);
    }
    public static void NumberPrimes1(int prime) {
        boolean bool = true;
        for (int i = 2; i <= prime / 2; i++) {
            if (prime % 2 == 0) {
                bool = false;
                break;
            }
        }
        if (bool) {
            System.out.println(prime);
        }
    }

}
