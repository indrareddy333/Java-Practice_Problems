package Practice_Daily;

public class _81_Swap4 {
    public static void main(String[] args) {
        int n = 9090;
        int m = 8080;
        n = m+n;
        m = n-m;
        n = n-m;
        System.out.println(n + " , " + m);
    }
}
