package Practice_Daily;
//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
public class _85_CellsWithOdd {
    public static void main(String[] args) {
        int[][] mat = {{5}};
        System.out.println(diagonalSum(mat));
    }
    public static  int diagonalSum(int[][] mat) {
        int number = 0;
        int diagnol = mat.length-1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    number = number + mat[i][j];
                }
                if (i != j && j==mat.length-(1+i)) {
                    number = number + mat[i][mat.length-(1+i)];
                }
            }
        }
        if(mat.length==0){
            number = mat[0][0];
        }
        return number;
    }
}
