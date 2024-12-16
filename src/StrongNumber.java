public class StrongNumber {
    public static void main(String[] args) {
        int num1 = 145;
        int num = num1;
        int result = 0;

        while(num>0){
            int div = num%10;
            int fact = 1;
            for (int i = div; i>0; i--){
                fact *= i;
            }
            result += fact;
            num/=10;
        }
        System.out.println(num1 == result ? "Strong Number" : "Not a Strong number");

    }
}
