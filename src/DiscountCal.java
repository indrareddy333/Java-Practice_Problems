import java.util.Scanner;

public class DiscountCal {
    public static void main(String[] args) {
        //Calculate Discount Of Product
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the product actual price - ");
        int discount = scan.nextInt();
        System.out.print("Enter thr product bought price - ");
        int bought = scan.nextInt();
        float discount_amount = (float)(discount*bought)/100;
        float discounted = bought - discount_amount;
        System.out.println("saved amount = "+ discount_amount);
        System.out.println("toatal = " + discounted);
        scan.close();
    }
}
