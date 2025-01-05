import java.util.Scanner;

public class Testingmem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int doller = 1;
        while (true){
            char c = scan.next().trim().charAt(0);
            if (c == 'y' || c == 'Y') {
                doller = doller * 2;
                System.out.println("Doller = " + doller);
            }
            else{
                break;
            }
        }
    }
}
