public class NumberReverse {
    public static void main(String[] args) {
        int number = 1067;
        int result = 0;

        while(number>0){
            int num = number%10;
            result = result * 10 + num;
            number/=10;
        }
        System.out.println(result);
    }
}
