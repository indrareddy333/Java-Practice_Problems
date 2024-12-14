public class FactorsOfNumber {
    public static void main(String[] args) {
        int num = 24;
        int div = 1;
        while(num>=div){
            if(num % div == 0) {
                System.out.println(div);
            }
            div++;
        }
    }
}
