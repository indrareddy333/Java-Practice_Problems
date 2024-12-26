public class FindPerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int result = 0;
        for (int i = 1; i < num;i++){
            if(num%i==0){
                result = result + i ;
            }
        }
        System.out.println(result==num?"Perfect Number": "Not a perfect number");
    }
}
