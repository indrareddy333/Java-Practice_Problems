import java.util.Scanner;

public class MethodWithArguments {
    public static void main(String[] args) {
        sum(45,56);
    }
    public static void sum(int a, int b){
        Scanner scan = new Scanner(System.in);
        System.out.println(a + b);
    }

}
