package Practice_OOPS_in_Java;

public class _01_BasicOOps {
    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 80;
        calculator cal = new calculator();
        System.out.println(cal.Adding(num1,num2));
    }
}
class calculator{
    public int Adding(int num1, int num2){
        int result = num1+num2;
        return result;
    }
}
