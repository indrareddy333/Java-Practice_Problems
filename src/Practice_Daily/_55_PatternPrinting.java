package Practice_Daily;
//   cols- 1 2 3 4 5 6 7
//         4 4 4 4 4 4 4  row = 1
//         4 3 3 3 3 3 4  row = 2
//         4 3 2 2 2 3 4  row = 3
//         4 3 2 1 2 3 4  row = 4  n
//         4 3 2 2 2 3 4  row = 5
//         4 3 3 3 3 3 4  row = 6
//         4 4 4 4 4 4 4  row = 7
public class _55_PatternPrinting {
    public static void main(String[] args) {
        int n = 4;
        int originaln = n;
        n = 2*n-2;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int min = originaln-Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(min+" ");
            }
            System.out.println();
        }

    }
}
