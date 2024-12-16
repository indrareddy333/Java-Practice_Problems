public class PrefectNumber {
    public static void main(String[] args) {
        int num = 28;
        int perfect = 0;
        for(int i = 1; i<num ; i++){
            if(num%i==0){
                perfect += i;
            }
        }
        System.out.print(num);
        System.out.println(num == perfect ? " is a Perfect number" : " is Not a Perfect Number");
    }
}
