package Practice_Daily;

public class _101_BinarySearch {
    public static void main(String[] args) {
        int[][] matrx = {{3,4,5},{3,4,5},{4,3,5}};
        int sum = 0;
        for (int i = 0; i < matrx.length; i++) {
            for (int j = 0; j < matrx[i].length; j++) {
                sum += matrx[i][j];
            }
        }
        System.out.println(sum);
    }
}
