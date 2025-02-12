package Practice_Daily;
//     * * * * *
//      * * * *
//       * * *
//        * *
//         *
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
public class _54_PatternPrinting {
    public static void main(String[] args) {
      pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <= 2*n ; row++) {
            int num = row > 5 ? row-n: n-row+1;
            int spaces = n-num;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
