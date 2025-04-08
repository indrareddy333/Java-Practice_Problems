package Practice_Daily;

public class _127_Patternprinting {
    public static void main(String[] args) {
        pattern(10);
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {
            int num = row > n ? 2 * n - row : row;
            int spaces = n - num;
            for (int i = 0; i < spaces; i++) {
                //System.out.print(" ");
            }
            for (int col = 0; col < num; col++) {
                //System.out.print("* ");
            }
            //System.out.println();
        }
    }

        public static void pattern(int n){
            for (int row = 1; row < n; row++) {
                if(row%2!=0){
                    int num = n-row;
                    for (int i = 0; i < num; i++) {
                        System.out.print(" ");
                    }
                    for (int col = 0; col < row; col++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        }
}
