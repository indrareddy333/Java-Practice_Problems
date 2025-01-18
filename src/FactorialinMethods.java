public class FactorialinMethods {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int num){
        int product = 1;
        for(int i = 1; i <=num;i++){
            product*=i;
        }
        return product;
    }
}
