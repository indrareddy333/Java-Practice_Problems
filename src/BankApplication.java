import java.util.Scanner;

public class BankApplication {
    /* bank application
      1. welcome to user
          ask username
      2. deposit
      3. withdraw
      4. mini statement
      5. menu
      6. exit
     */

    static int deposit;
    static int withdraw;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = {"Deposit", "Withdraw", "mini statement", "Menu", "Exit"};
        char cha = 'A';
        for(int i = 0;i<10;i++){
            System.out.print("===");
        }
        System.out.println();
        for(int i = 0;i<array.length;i++){
            char ch = (char) (cha + i);
            System.out.println(ch + " " + array[i]);
        }
        for(int i = 0;i<10;i++){
            System.out.print("===");
        }
        System.out.println();
        while(true){
            System.out.println("Enter the operation = ");
            String operation = scan.next();

            if(operation.equals(array[0])){
                System.out.println("enter the amount = ");
                int dep = scan.nextInt();
                deposit += dep;
            }
            if(operation.equals(array[1])){
                System.out.println("enter the withdraw  amount = ");
                int Wd = scan.nextInt();
                if(Wd<deposit){
                    withdraw = deposit - Wd;
                    deposit = deposit - Wd;
                }
                else{
                    System.err.println("You don't have enough amount to withdraw");
                }

            }
            if(operation.equals(array[3])){
                System.out.println(" ========= Menu ========= ");
                for(int i = 0;i<10;i++){
                    System.out.print("===");
                }
                System.out.println();
                for(int i = 0;i<array.length;i++){
                    char ch = (char) (cha + i);
                    System.out.println(ch + " " + array[i]);
                }
                for(int i = 0;i<10;i++){
                    System.out.print("===");
                }
                System.out.println();
            }
            if(operation.equals("Exit")){
                break;
            }

        }
    }

}
