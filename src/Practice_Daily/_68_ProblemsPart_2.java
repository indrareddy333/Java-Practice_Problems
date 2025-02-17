package Practice_Daily;

public class _68_ProblemsPart_2 {
    public static void main(String[] args) {
        //Prime(100);
        //sumOfDigits(111111);
        //ReverseNumber(345);
        //Plaindrome(343);
        //Armstong(153);
        Fibonacci(5);

    }
    //Given Number is Prime or Not in Java
    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    public static void Prime(int number) {
        for (int i = 2; i <= number; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if(i%j==0){
                    count++;
                }
                if(count==2){
                    break;
                }
            }
            if(count==1){
                System.out.print(i + ",");
            }
        }
    }
    //Sum of digits of a number
    public static void sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            int num = number%10;
            sum += num;
            number = number/10;
        }
        System.out.println(sum);
    }
    //Reverse of a number
    public static int ReverseNumber(int num){
        int number = 0;
        while(num > 0){
            int digit = num%10;
            number = number * 10 + digit;
            num = num/10;
        }
        return number;
    }
    //Palindrome number
    public static void Plaindrome(int number){
        int reverse = ReverseNumber(number);
        if(number==reverse){
            System.out.println("plaindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
    //Armstrong number
    public static void Armstong(int number){
        int count = 0;
        int num = number;
        while(num > 0){
            count++;
            num = num/10;
        }

        int armstrong = 0;
        while(number > 0){
            int rem = number%10;
            int x = 1;
            for (int i = 0; i < count; i++) {
                x = x*rem;
            }
            armstrong = armstrong+x;
            number = number/10;
        }
    }
    //Fibonacci Series upto nth term
    public static void Fibonacci(int nth){
        int m = 1;
        int n = 1;
        int result = 0;
        for (int i = 0; i < nth-1; i++) {
            result = n+m;
            n = m;
            m = result;
            System.out.println(result);
        }
    }
}
