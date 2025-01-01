import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int add = 0;
        while(true){
            int num = scan.nextInt();
            if(num!=0){
                add = add+num;
            }
            else{
                break;
            }
        }
        System.out.println(add);
    }
}

