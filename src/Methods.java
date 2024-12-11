import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two numbers - ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a + b);


    }

}
