import java.util.Random;

public class RandomNum {
    public static void main(String[] args){
        Random rand = new Random();
        int num1 = 0;
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(9);
            num1 = num1*10+num;
        }
        if(num1>0){
            System.out.println(num1);
        }
        else{
            System.out.println(num1*-1);
        }
    }
}