public class TwoDarray {
    public static void main(String[] args){
        int[][] nums = {{2,3,4}, {3,4,5}, {4,5,6}};
        int target = 6;
        for (int i = 0; i<nums.length;i++){
            for(int j = 0; j<nums.length;j++){
                if(target == nums[i][j]){
                    System.out.println(i+" "+j);
                }
            }
        }
    }

}
