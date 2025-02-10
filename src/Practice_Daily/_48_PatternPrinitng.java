package Practice_Daily;

public class _48_PatternPrinitng {
    public static void main(String[] args) {
        /*1
          2 3
          4 5 6
          7 8 9 10
         */
        int num = 1;
        for (int i = 0;i<6;i++){
            for(int j = 0; j <= i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
