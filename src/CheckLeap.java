import java.util.Scanner;
// leap years - 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.
public class CheckLeap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the the year - ");
        int num = scan.nextInt();
        if(num%4==0){
            System.out.println(num + " is Leap Year");
        }else{
            System.out.println(num + " is Not a leap year");
        }
    }
}
