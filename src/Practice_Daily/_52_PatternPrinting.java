package Practice_Daily;

public class _52_PatternPrinting {
    public static void main(String[] args) {
        int n = 7;
        for (int row = 0; row < 2*n; row++) {
            int num = row > n ? 2*n - row : row;
            for (int col = 0; col < num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
