package Practice_Daily;

public class _56_PatternPrinting {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col+" ");
            }
            for (int col1 = 2; col1 <= row; col1++) {
                System.out.print(col1+" ");
            }
            System.out.println();
        }
    }
}
