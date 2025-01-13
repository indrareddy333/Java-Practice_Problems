import java.util.Scanner;

public class MaxANDminthree {
    //How to Find the Largest and Smallest of Three Numbers in Java?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(smallest(num1, num2,num3));
        System.out.println(largest(num1, num2,num3));
    }
    public static int largest(int first, int second, int third){
        if(first > second && first > third){
            return first;
        }
        else if(second > third){
            return second;
        }else{
            return third;
        }
    }
    public static int smallest(int first, int second, int third){
        if(first < second && first < third){
            return first;
        }
        else if(second < third){
            return second;
        }else{
            return third;
        }
    }
}
