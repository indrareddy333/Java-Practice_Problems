public class OddorEven {
    public static void main(String[] args) {
        System.out.println(evenORodd(3));
    }
    public static String evenORodd(int num){
        if(num>=2&&num%2==0){
            return "Even";
        }
        return "Odd";
    }
}
