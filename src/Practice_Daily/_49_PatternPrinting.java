package Practice_Daily;

public class _49_PatternPrinting {
    public static void main(String[] args) {
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        //    ****
        //    ***
        //    **
        //    *
        int i2 = 2;
        for (int i = 0; i<9; i++){   //5-2 = 3 ; 6-4 = 2; 7-6 = 1; 8 - 8 = 0;
            int num = i;
            if(i>4) {
                num = i - i2;
                i2 = i2 + 2;
            }
            for(int j = 0; j<=num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
