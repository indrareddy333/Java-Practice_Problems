public class RichestWealth {
    public static void main(String[] args) {
        int [][] array = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(richestWealth(array));
    }
    public static int richestWealth(int[][] array){
        int result = 0;
        int num = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                num = num + array[i][j];
            }
            if(num >= result){
                result = num;
            }
            num = 0;
        }
        return result;
    }

}
