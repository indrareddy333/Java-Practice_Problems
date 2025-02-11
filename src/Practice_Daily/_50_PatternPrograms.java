package Practice_Daily;

public class _50_PatternPrograms {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            if (row == 0 || row == 4) {
                for (int col = 0; col < 5; col++) {
                    System.out.print("* ");
                }
            }
            else{
                for (int col = 0; col < 5; col++) {
                    if(row >= 0 && col == 0 || row >= 0 && col == 4){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }

    }
}
