public class PerfectSquare {
    public static void main(String[] args) {
        int num = 36;
        int result = 0;
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num%i==0){
                result = i;
            }
        }
        System.out.println(result*result==num?"Perfect Square":"Not a Perfect square");
    }
}
