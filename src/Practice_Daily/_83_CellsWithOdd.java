package Practice_Daily;
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
public class _83_CellsWithOdd {
    public static void main(String[] args) {
        int m = 2, n = 3;
        int[][] indices = {{0,1},{1,1}};
        int number = oddCells(m, n, indices);
        System.out.println(number);

    }
    public static int oddCells(int m, int n, int[][] indices) {
        int index = 0;
        int[][] mat = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < indices[i].length; j++) {
                index = 0;
                if (j > 0) {
                    while (index < mat.length) {
                        mat[index][indices[i][j]] += 1;
                        index++;
                    }
                } else {
                    while (index < mat[0].length) {
                        mat[indices[i][j]][index] += 1;
                        index++;
                    }
                }
            }
        }

        int oddCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }
}
