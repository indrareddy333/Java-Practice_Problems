package Practice_Daily;

public class _51_PatternPrinting {
    public static void main(String[] args) {
        for(int row = 0; row<8; row++){
            for(int col = row; col<8; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int row = 1; row<10; row++){
            for(int col = 1; col<row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
