import java.util.Arrays;
import java.util.Scanner;

public class Calculate_Student_grade {
    public static void main(String[] args) {
         marks();
    }
    public static void marks() {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int[] array = new int[3];
        System.out.println("Enter your marks to calculate");
        System.out.print("Maths marks = ");
        array[0] = scan.nextInt();
        System.out.print("Physics marks = ");
        array[1] = scan.nextInt();
        System.out.print("Chemistry marks = ");
        array[2] = scan.nextInt();
        for (int i = 0; i < 3; i++) {
            total = total + array[i];
        }
        if (array[0] <= 100 && array[1] <= 100 && array[2] <= 100) {
            System.out.println("Total Marks = " + total);
            int percentage = total * 100 / 300;
            System.out.println("Percentage = " + percentage + "%");
            if (100 >= percentage && percentage >= 91) {
                System.out.println("Grade = A++");
                System.out.println("Remark : outstanding");
            } else if (90 >= percentage && percentage >= 81) {
                System.out.println("Grade = A+");
                System.out.println("Remark : Excellent");
            } else if (80 >= percentage && percentage >= 71) {
                System.out.println("Grade = B++");
                System.out.println("Remark : Very Good");
            } else if (70 >= percentage && percentage >= 61) {
                System.out.println("Grade = B+");
                System.out.println("Remark : Good");
            } else if (61 >= percentage && percentage >= 50) {
                System.out.println("Grade = c++");
                System.out.println("Remark : Above Average");
            }else{
                System.out.println("Grade = c+");
                System.out.println("Remark : Average");
            }
        } else {
            System.err.println("Your marks are entered above 100 it should be below 100");
        }

    }

}


