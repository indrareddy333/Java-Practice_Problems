public class FindStrongNumber {
    public static void main(String[] args) {
        int num1 = 145;
        int num = num1;
        int result = 0;
        while(num > 0){
            int qus = num%10;
            int res = 1;
            for(int i = qus; i >= 1; i--){
                res = res*i;
            }
            result = result + res;
            num = num/10;
        }
        System.out.println(result == num1 ? "Strong Number": "Not a Strong Number");
    }
}
