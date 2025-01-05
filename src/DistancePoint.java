import java.util.Scanner;

public class DistancePoint {
    public static void main(String[] args) {
        //Calculate Distance Between Two Points
        Scanner scan = new Scanner(System.in);
        System.out.print("Point_1 = ");
        int point1 = scan.nextInt();
        System.out.print("Point_2 = ");
        int point2 = scan.nextInt();
        if(point1<=point2){
            System.out.println("distance = " + (point2-point1));
        }
        else{
            System.out.println("distance = "+(point1-point2));
        }
    }
}
