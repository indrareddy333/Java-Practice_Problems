package Practice_Daily;

public class _99_RecursionFibnochi {
    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fact(5));
    }
    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
    return n * fact(n-1);
    }

}
