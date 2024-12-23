import java.util.Scanner;

public class Calculate_Electricity_Bill {
    public static void main(String[] args) {
        application();
    }

    // user as to enter how many applications they use in the house
    public static void application(){
        Scanner scan = new Scanner(System.in);
        System.out.println("================ Welcome! to  Electricity bill Calculator  ================");
        System.out.println("Select the applications of your daily use and get your monthly bill");
        String[] list = {"Air conditioner","Electric water heater", "Light bulb (incandescent)", "Light bulb (LED)","Fan (ceiling, table)", "Air conditioner","refrigerator","Electric cooker/stove","Microwave","Electric cooker","Television","Desktop computer","washing Machine" };
        for (int i = 0; i < list.length;i++){
            System.out.println((i+1) +" . "+ list[i]);
        }
        for(int i = 0; i < 30;i++){
            System.out.print("===");
        }
        System.out.println();
        System.out.print("Enter the number from above list of Appliances = ");
        int num;
        int watt;
        switch(scan.nextInt()){
            case 1:
                System.out.println(list[0]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 5000 * num;
                System.out.println("per day = "+ watt/1000+" Kwh");
                System.out.println("per week = "+ watt*7/1000+" kwh");
                System.out.println("per month = "+ watt * 31/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 30/1000)*6 + "₹ /-"  );
                break;
            case 2:
                System.out.println(list[1]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 4000 * num;
                System.out.println("per day = "+ watt/1000+" Kwh");
                System.out.println("per week = "+ watt*7/1000+" kwh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 3:
                System.out.println(list[2]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;

            case 4:
                System.out.println(list[3]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 5:
                System.out.println(list[4]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 6:
                System.out.println(list[5]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 7:
                System.out.println(list[6]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 8:
                System.out.println(list[7]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 9:
                System.out.println(list[8]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 10:
                System.out.println(list[9]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 11:
                System.out.println(list[10]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 12:
                System.out.println(list[11]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            case 13:
                System.out.println(list[12]);
                System.out.print("Enter the how many hours use in a day : - ");
                num = scan.nextInt();
                watt = 60 * num;
                System.out.println("per day = "+ watt+" wh");
                System.out.println("per week = "+ watt*7+" wh");
                System.out.println("per month = "+ watt * 30/1000 +" kwh");
                System.out.println("per Monthly Price = " + (watt * 31/1000)*6 + "₹ /-"  );
                break;
            default:
                System.err.println("you have entered invalid number try again");
            }



    }



}
