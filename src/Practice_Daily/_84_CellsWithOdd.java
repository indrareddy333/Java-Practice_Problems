package Practice_Daily;

public class _84_CellsWithOdd {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] nums = new int[m][n];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(i == 0 && j == 1){
                    nums[0][1]+=1;
                }
                if(i == 0 && j == 0){
                    nums[0][0]+=1;
                }
                if(i == 2 && j == 2){
                    nums[0][1]+=1;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
