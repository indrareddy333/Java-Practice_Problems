public class Facmethod {
    //Write a program to print the factorial of a number by defining a method named 'Factorial'.
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
    public static int Factorial(int num){
        int product = 1;
        for(int i = 1; i<=num;i++){
            product = product*i;
        }
        return product;
    }
}
