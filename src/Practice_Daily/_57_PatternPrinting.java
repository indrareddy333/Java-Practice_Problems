package Practice_Daily;

public class _57_PatternPrinting {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 1; row <= 2 * n; row++) {
            int number = row > n ? 2 * n - row : row;
            for (int spaces = 0; spaces < n - number; spaces++) {
                System.out.print("  ");
            }
            //6-2 = 4; 7-4=3 8-6=2 9-8=1
            for (int col = number; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col1 = 2; col1 <= number; col1++) {
                System.out.print(col1 + " ");
            }
            System.out.println();
        }
    }
}
