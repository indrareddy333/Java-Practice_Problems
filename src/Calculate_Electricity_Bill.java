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
        System.out.println("Select the applications of your daily use and get your monthly bill");
        String[] list = {"Air conditioner","Electric water heater", "Light bulb (incandescent)", "Light bulb (LED)","Fan (ceiling, table)", "Air conditioner","refrigerator","Electric cooktop/stove","Microwave","Electric cooker","Television","Desktop computer","washing Machine" };
        for (int i = 0; i < list.length;i++){
            System.out.println((i+1) +" . "+ list[i]);
        }
        for(int i = 0; i < 30;i++){
            System.out.print("==");
        }
        System.out.println();
        System.out.println("Enter the number form above list = ");
        switch(scan.nextInt()){
            case 1:
                System.out.println(list[0]);
                System.out.print("Enter the how many hours use in a day : - ");
                int num = scan.nextInt();
                int watt = 1200 * num;
                System.out.println(watt+"kwh");
        }
    }

}
