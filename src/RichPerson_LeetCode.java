public class RichPerson_LeetCode {
    public static void main(String[] args) {
      int[][] nums = {{1,2,3},{1,1,1}};
        System.out.println(Richwealth(nums));
    }
    public static int Richwealth(int[][] nums){
        int num = 0;
        int great = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = 0;j < nums[i].length;j++){
                num = num + nums[i][j];
            }
            if(num>great){
                great = num;
            }
            num = 0;
        }
        return great;
    }
}
