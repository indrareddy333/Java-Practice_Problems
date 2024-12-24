import java.util.ArrayList;
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
    static int balance;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> wd = new ArrayList<>();
        ArrayList<Integer> amt = new ArrayList<>();
        String[] array = {"Deposit", "Withdraw", "mini-statement", "Menu", "Exit"};
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
            System.out.println();
            System.out.print("Enter the operation = ");
            char operation = scan.next().trim().charAt(0);
            //deposit section
            if(operation == 'A'){
                System.out.print("enter the amount = ");
                int dep = scan.nextInt();
                deposit += dep;
                balance += dep;
                wd.add("Deposit");
                amt.add(dep);
            }
            //withdraw amount
            if(operation=='B'){
                System.out.print("enter the withdraw  amount = ");
                int Wd = scan.nextInt();
                if(Wd<deposit){
                    withdraw = deposit - Wd;
                    deposit = deposit - Wd;
                    balance -= Wd;
                    wd.add("Withdraw");
                    amt.add(Wd);
                }
                else{
                    System.err.println("You don't have enough amount to withdraw");
                }

            }
            // print menu if user want to menu
            if(operation == 'D'){
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
            // check if the user want to exit
            if(operation=='E'){
                break;
            }
            //mini statement
            if(operation == 'C'){
                System.out.println("----------- " + array[2] + " -----------" );
                for (int i = 0; i < wd.size(); i++){
                    System.out.println(wd.get(i) + " = " + amt.get(i) );
                }
                System.out.println();
                System.out.println("Balance = "+ balance);
                System.out.println("--------------------------------------");
            }
        }
    }

}
