public class SwapNum {
    public static void main(String[] args) {
        swap(20,40);
    }
    public static void swap(int a, int b){
       int num1 = (a+b)-a;
       int num2 = (a+b)-b;
       System.out.println(num1);
       System.out.println(num2);

    }

}
