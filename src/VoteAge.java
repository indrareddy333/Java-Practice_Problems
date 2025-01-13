import java.util.Scanner;

public class VoteAge {
    //A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age - ");
        int age = scan.nextInt();
        System.out.println(Votechecker(age));
    }
    public static String Votechecker(int age){
        if(age > 18){
            return "Eligible to Vote";
        }
        return "Not Eligible to vote";
    }
}
