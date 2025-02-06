package Practice_Daily;

public class _42_PatternPrinting03 {
    public static void main(String[] args) {
        /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
         */
        for(int i = 1; i<6;i++){
            for(int j = 0; j < i; j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }

    }
}
