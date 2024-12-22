import java.util.Scanner;

public class Calculate_Electricity_Bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      application();
    }

    // user as to enter how many applications they use in the house
    public static void application(){
        Scanner scan = new Scanner(System.in);
        System.out.println("================Welcome ! Calculate your Electricity bill here :)================");
        System.out.println("Enter the applications of your daily use and get your monthly bill");
        System.out.println("If your entered all applications Type 'Exit or X' to generate bill");
        while(true){
            System.out.print("Enter the application = ");
            String app = scan.next();
            //if user want to exit
            if(app.equals("Exit") || app.equals("exit") || app.equals("X") || app.equals("x")){
                break;
            }
            System.out.print("No. of "+app+"s"+" = ");
            int NoOFapps = scan.nextInt();
        }
        System.out.println("Application Exit");
    }

}
