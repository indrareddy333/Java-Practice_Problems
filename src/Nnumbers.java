import java.util.Scanner;

public class Nnumbers {
    public static void main(String[] args) {
        //Calculate Average Of N Numbers
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int num = scan.nextInt();
        int sum = num*(num+1)/2;
        System.out.println("Sum of n numbers is "+sum);
    }
}
