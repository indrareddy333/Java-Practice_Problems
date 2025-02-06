package Practice_Daily;

public class _41_PatternPrinting02 {
    public static void main(String[] args) {
        for(int i = 1; i<5;i++){
            for(int j = 0; j<i;j++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
