import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist2D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

        for(int i = 0; i <3; i++){
            array.add(new ArrayList<>());
        }

        for(int i = 0; i <3; i++){
            for(int j = 0; j <3; j++){
                  array.get(i).add(scan.nextInt());
            }
        }
        System.out.println(array);


    }
}
