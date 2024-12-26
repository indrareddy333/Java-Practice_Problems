public class PowerofNUmber {
    public static void main(String[] args) {
        int base = 3;
        int expo = 5;
        int num = 1;
        for(int i = 1; i<=expo;i++){
            num *= base;
        }
        System.out.println(num);
    }
}
