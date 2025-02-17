package Practice_Daily;

public class _67_ProblemsBasics {
    public static void main(String[] args) {
        //SumofGivenRange(12,15);
        //GretestNUmber(12, 23);
        LeapYear(2025);
    }
    public static void PositiveorNegtive(int num){
        if(num < 0){
            System.out.println("Negative");
        }else{
            System.out.println("positive");
        }
    }
    public static void EvenorOdd(int num){
        if(num % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    //Sum of First N Natural numbers
    public static void NatiralNumber(int num){
        int nat = num*(num+1)/2;
        System.out.println(nat);
    }
    public static void SumofGivenRange(int range, int range2){
        int num = (range2*(range2+1)/2) - ((range-1)*((range-1)+1)/2);
        System.out.println(num);
    }
    //Find Greatest of Two Numbers
    public static void GretestNUmber(int num , int num2){
        if(num > num2){
            System.out.println(num + " greatest");
        }
        else{
            System.out.println(num2 + " greatest");
        }
    }
    //greatest of three numbers
    public static void threeNumbers(int num, int num1, int num2){
        if(num > num1 && num > num2){
            System.out.println(num + "greatest");
        }
        else if(num1 > num2){
            System.out.println(num1 + "greatest");
        }
        else{
            System.out.println(num2 + "greatest");
        }
    }
    //Leap year or not
    public static void LeapYear(int year){
        if(year%4==0){
            System.out.println("leap Year");
        }
        else{
            System.out.println("not a Leap Year");
        }
    }


}

